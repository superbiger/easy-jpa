package com.sbiger.qbe;

import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Order;

/**
 * Example Base Object
 *
 * Created by sbiger on 2016-11-24.
 */
public interface ExampleQuery<T>{

    Example<T> join(Class c);

    Example<T> innerJoin(Class c);

    Example<T> leftJoin(Class c);

    Example<T> rightJoin(Class c);

    Example<T> join(Class c, JoinType type);

    Example<T> asc(String... properties);

    Example<T> desc(String... properties);

    ExampleCriteria<T> or();

}
