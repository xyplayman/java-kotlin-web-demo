/*
 * This file is generated by jOOQ.
 */
package org.xyplayman.demo.jooq;


import javax.annotation.processing.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;
import org.jooq.types.ULong;
import org.xyplayman.demo.jooq.tables.Article;
import org.xyplayman.demo.jooq.tables.ArticleTag;
import org.xyplayman.demo.jooq.tables.Tag;
import org.xyplayman.demo.jooq.tables.records.ArticleRecord;
import org.xyplayman.demo.jooq.tables.records.ArticleTagRecord;
import org.xyplayman.demo.jooq.tables.records.TagRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>demo</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ArticleRecord, ULong> IDENTITY_ARTICLE = Identities0.IDENTITY_ARTICLE;
    public static final Identity<ArticleTagRecord, ULong> IDENTITY_ARTICLE_TAG = Identities0.IDENTITY_ARTICLE_TAG;
    public static final Identity<TagRecord, ULong> IDENTITY_TAG = Identities0.IDENTITY_TAG;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ArticleRecord> KEY_ARTICLE_PRIMARY = UniqueKeys0.KEY_ARTICLE_PRIMARY;
    public static final UniqueKey<ArticleTagRecord> KEY_ARTICLE_TAG_PRIMARY = UniqueKeys0.KEY_ARTICLE_TAG_PRIMARY;
    public static final UniqueKey<TagRecord> KEY_TAG_PRIMARY = UniqueKeys0.KEY_TAG_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<ArticleRecord, ULong> IDENTITY_ARTICLE = Internal.createIdentity(Article.ARTICLE, Article.ARTICLE.ID);
        public static Identity<ArticleTagRecord, ULong> IDENTITY_ARTICLE_TAG = Internal.createIdentity(ArticleTag.ARTICLE_TAG, ArticleTag.ARTICLE_TAG.ID);
        public static Identity<TagRecord, ULong> IDENTITY_TAG = Internal.createIdentity(Tag.TAG, Tag.TAG.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<ArticleRecord> KEY_ARTICLE_PRIMARY = Internal.createUniqueKey(Article.ARTICLE, "KEY_article_PRIMARY", Article.ARTICLE.ID);
        public static final UniqueKey<ArticleTagRecord> KEY_ARTICLE_TAG_PRIMARY = Internal.createUniqueKey(ArticleTag.ARTICLE_TAG, "KEY_article_tag_PRIMARY", ArticleTag.ARTICLE_TAG.ID);
        public static final UniqueKey<TagRecord> KEY_TAG_PRIMARY = Internal.createUniqueKey(Tag.TAG, "KEY_tag_PRIMARY", Tag.TAG.ID);
    }
}
