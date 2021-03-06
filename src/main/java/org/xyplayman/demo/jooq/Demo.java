/*
 * This file is generated by jOOQ.
 */
package org.xyplayman.demo.jooq;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.xyplayman.demo.jooq.tables.Article;
import org.xyplayman.demo.jooq.tables.ArticleTag;
import org.xyplayman.demo.jooq.tables.Tag;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Demo extends SchemaImpl {

    private static final long serialVersionUID = 1624154044;

    /**
     * The reference instance of <code>demo</code>
     */
    public static final Demo DEMO = new Demo();

    /**
     * 文章
     */
    public final Article ARTICLE = org.xyplayman.demo.jooq.tables.Article.ARTICLE;

    /**
     * 文章和标签关联
     */
    public final ArticleTag ARTICLE_TAG = org.xyplayman.demo.jooq.tables.ArticleTag.ARTICLE_TAG;

    /**
     * 标签
     */
    public final Tag TAG = org.xyplayman.demo.jooq.tables.Tag.TAG;

    /**
     * No further instances allowed
     */
    private Demo() {
        super("demo", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Article.ARTICLE,
            ArticleTag.ARTICLE_TAG,
            Tag.TAG);
    }
}
