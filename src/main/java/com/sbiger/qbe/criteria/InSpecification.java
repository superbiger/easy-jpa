package com.sbiger.qbe.criteria;

import com.sbiger.qbe.interfaces.AbstractSpecification;
import com.sbiger.qbe.interfaces.ExampleCriteria;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Predicate;

/**
 * Created by sbiger on 2016-12-09.
 */
public class InSpecification<T> extends AbstractSpecification<T> {
    private final String property;

    private final Object[] values;

    private final ExampleCriteria.BooleanOperator type;

    public InSpecification(ExampleCriteria.BooleanOperator type, String property, Object[] values) {
        this.property = property;
        this.values = values;
        this.type = type;
    }

    @Override
    public Predicate toPredicate(From root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        return root.get(property).in(values);
    }
}
