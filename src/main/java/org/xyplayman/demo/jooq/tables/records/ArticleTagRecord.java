/*
 * This file is generated by jOOQ.
 */
package org.xyplayman.demo.jooq.tables.records;


import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;
import org.xyplayman.demo.jooq.tables.ArticleTag;


/**
 * 文章和标签关联
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ArticleTagRecord extends UpdatableRecordImpl<ArticleTagRecord> implements Record3<ULong, ULong, ULong> {

    private static final long serialVersionUID = 839534058;

    /**
     * Setter for <code>demo.article_tag.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>demo.article_tag.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>demo.article_tag.article_id</code>.
     */
    public void setArticleId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>demo.article_tag.article_id</code>.
     */
    public ULong getArticleId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>demo.article_tag.tag_id</code>.
     */
    public void setTagId(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>demo.article_tag.tag_id</code>.
     */
    public ULong getTagId() {
        return (ULong) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<ULong, ULong, ULong> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<ULong, ULong, ULong> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return ArticleTag.ARTICLE_TAG.ID;
    }

    @Override
    public Field<ULong> field2() {
        return ArticleTag.ARTICLE_TAG.ARTICLE_ID;
    }

    @Override
    public Field<ULong> field3() {
        return ArticleTag.ARTICLE_TAG.TAG_ID;
    }

    @Override
    public ULong component1() {
        return getId();
    }

    @Override
    public ULong component2() {
        return getArticleId();
    }

    @Override
    public ULong component3() {
        return getTagId();
    }

    @Override
    public ULong value1() {
        return getId();
    }

    @Override
    public ULong value2() {
        return getArticleId();
    }

    @Override
    public ULong value3() {
        return getTagId();
    }

    @Override
    public ArticleTagRecord value1(ULong value) {
        setId(value);
        return this;
    }

    @Override
    public ArticleTagRecord value2(ULong value) {
        setArticleId(value);
        return this;
    }

    @Override
    public ArticleTagRecord value3(ULong value) {
        setTagId(value);
        return this;
    }

    @Override
    public ArticleTagRecord values(ULong value1, ULong value2, ULong value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ArticleTagRecord
     */
    public ArticleTagRecord() {
        super(ArticleTag.ARTICLE_TAG);
    }

    /**
     * Create a detached, initialised ArticleTagRecord
     */
    public ArticleTagRecord(ULong id, ULong articleId, ULong tagId) {
        super(ArticleTag.ARTICLE_TAG);

        set(0, id);
        set(1, articleId);
        set(2, tagId);
    }
}
