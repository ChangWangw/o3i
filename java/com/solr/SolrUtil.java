package com.solr;

import java.io.IOException;
import java.util.List;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;


/**
 * @author Change
 */
public class SolrUtil {

    /**
     * 指定solr服务器的地址
     */
    private final static String SOLR_URL = "http://localhost:8983/solr/";
    private final static String NAME = "articles";
    private final static HttpSolrClient SOLR_NAME = new HttpSolrClient.Builder(SOLR_URL + NAME).withConnectionTimeout(10000).withSocketTimeout(60000).build();

    /**
     * 创建SolrServer对象
     * 该对象有两个可以使用，都是线程安全的
     * 1、CommonsHttpSolrServer：启动web服务器使用的，通过http请求的
     * 2、 EmbeddedSolrServer：内嵌式的，导入solr的jar包就可以使用了
     * 3、solr 4.0之后好像添加了不少东西，其中CommonsHttpSolrServer这个类改名为HttpSolrClient
     * @return
     */
//    public HttpSolrClient createSolrServer(){
//        HttpSolrClient solr = null;
//        solr = new HttpSolrClient.Builder(SOLR_URL).withConnectionTimeout(10000).withSocketTimeout(60000).build();
//        return solr;
//    }

    /**
     * 往索引库添加文档
     *
     * @throws IOException
     * @throws SolrServerException
     */
    public void addDoc() throws SolrServerException, IOException {
        /**
         * 构造一篇文档
         */
        SolrInputDocument document = new SolrInputDocument();
        /**
         * 往doc中添加字段,在客户端这边添加的字段必须在服务端中有过定义
         */
        document.addField("id", "1");
        document.addField("name", "zs");
        document.addField("price", "a code man");
        /**
         * 获得一个solr服务端的请求，去提交  ,选择具体的某一个solr core
         */
        SOLR_NAME.add(document);
        closes(SOLR_NAME);
    }

    /**
     * 关闭连接
     */
    public void closes(HttpSolrClient solr) throws IOException, SolrServerException {
        solr.commit();
        solr.close();
    }

    /**
     * 根据id从索引库删除文档
     */
    public void deleteDocumentById() throws Exception {
        //选择具体的某一个solr core
        SOLR_NAME.deleteById("8");
        /**
         * 删除所有的索引
         * solr.deleteByQuery("*:*");
         */
        closes(SOLR_NAME);
    }


    /**
     * 查询
     *
     * @throws Exception
     */
    public void querySolr() throws Exception {
//        HttpSolrClient solrServer = new HttpSolrClient.Builder(SOLR_URL + "articles/").withConnectionTimeout(10000).withSocketTimeout(60000).build();

        SolrQuery query = new SolrQuery();

        /**
         * 设置solr查询参数
         * 相关查询，比如某条数据某个字段含有周、星、驰三个字  将会查询出来 ，这个作用适用于联想查询
         * query.set("q", "*:*");// 参数q  查询所有
         */
        query.set("q", "*:*");

        /**
         * 参数fq, 给query增加过滤查询条件
         */

        /**
         *给query增加布尔过滤条件
         * id为0-4
         *
         * query.addFilterQuery("description:演员")
         * description字段中含有“演员”两字的数据
         */
        query.addFilterQuery("id:[0 TO 9]");

        /**
         * 参数df,给query设置默认搜索域
         */
        query.set("df", "name");

        /**
         * 参数sort,设置返回结果的排序规则
         */
        query.setSort("id", SolrQuery.ORDER.desc);

        /**
         * 设置分页参数
         */
        query.setStart(0);
        /**
         * 每一页多少值
         */
        query.setRows(10);

        /**
         * 参数hl,设置高亮
         */
        query.setHighlight(true);
        /**
         * 设置高亮的字段
         */
        query.addHighlightField("name");
        /**
         * 设置高亮的样式
         */
        query.setHighlightSimplePre("<font color='red'>");
        query.setHighlightSimplePost("</font>");
        /**
         * 获取查询结果
         * 两种结果获取：得到文档集合或者实体对象
         */
        QueryResponse response = SOLR_NAME.query(query);

        /**
         * 查询得到文档的集合
         */
        SolrDocumentList solrDocumentList = response.getResults();
        System.out.println("通过文档集合获取查询的结果");
        System.out.println("查询结果的总数量：" + solrDocumentList.getNumFound());
        /**
         * 遍历列表
         */
        for (SolrDocument doc : solrDocumentList) {
            System.out.println("id:" + doc.get("id") + "   name:" + doc.get("name") + "    description:" + doc.get("description"));
        }

        /**
         * 得到实体对象
         */
        List<Person> tmpLists = response.getBeans(Person.class);
        if (tmpLists != null && tmpLists.size() > 0) {
            System.out.println("通过文档集合获取查询的结果");
            for (Person per : tmpLists) {
                System.out.println("id:" + per.getId() + "   name:" + per.getName() + "    description:" + per.getDescription());
            }
        }
    }


    public static void main(String[] args) throws Exception {
        SolrUtil solr = new SolrUtil();
//        solr.createSolrServer();
//        solr.addDoc();
        //solr.deleteDocumentById();
        solr.querySolr();
    }
}