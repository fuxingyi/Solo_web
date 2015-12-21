package com.solo.dao.util;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * ��װ������ɾ�Ĳ�
 * 
 * @author liuchchc
 * @date 2014��3��28��-����2:44:34
 * @param <T>
 */
public class GenericBaseDao<T> {

//    @Autowired
//    private SessionFactory sessionFactory;
//
//    public Session getSession() {
//        return this.sessionFactory.getCurrentSession();
//    }
//
//    /*
//     * ����������ȡ��ѯ���
//     */
//    @SuppressWarnings("unchecked")
//    public T get(Class<T> clazz, Long id) {
//        return (T) this.getSession().get(clazz, id);
//    }
//
//    /**
//     * �����������ϲ�ѯ���
//     * 
//     * @param clazz
//     * @param ids
//     * @return
//     */
//    public List<T> get(Class<T> clazz, List<Long> ids) {
//        StringBuilder hql = new StringBuilder();
//        hql.append(" from " + clazz.getName() + " where id in(:ids)");
//
//        Query query =
//                this.createQuery(hql.toString()).setParameterList("ids", ids);
//        @SuppressWarnings("unchecked")
//        List<T> items = query.list();
//        return items;
//    }
//
//    /*
//     * hql��ѯ�����׽��
//     */
//    @SuppressWarnings("unchecked")
//    public T get(String hql) {
//        List<T> l = this.createQuery(hql).list();
//        if ((l != null) && (l.size() > 0)) {
//            return l.get(0);
//        }
//        return null;
//    }
//
//    /*
//     * hql��ѯ�����׽�� ֧�ֲ�����map����
//     */
//    @SuppressWarnings("unchecked")
//    public T get(String hql, Map<String, Object> params) {
//        Query q = this.createQueryWithParams(hql, params);
//        List<T> l = q.list();
//        if ((l != null) && (l.size() > 0)) {
//            return l.get(0);
//        }
//        return null;
//    }
//
//    /*
//     * ��ȡclass��Ӧtable������������
//     */
//    @SuppressWarnings({
//        "rawtypes", "unchecked"
//    })
//    public List<T> getAllList(Class clazz) {
//        return this.getSession().createCriteria(clazz).list();
//    }
//
//    /*
//     * hql��ѯ��ȡƥ��������
//     */
//    @SuppressWarnings("unchecked")
//    public List<T> find(String hql) {
//        return this.createQuery(hql).list();
//    }
//
//    /*
//     * hql��ѯ��ȡƥ�������� ֧�ֲ�����map����
//     */
//    @SuppressWarnings("unchecked")
//    public List<T> find(String hql, Map<String, Object> params) {
//        Query q = this.createQueryWithParams(hql, params);
//        return q.list();
//    }
//
//    /*
//     * hql��ѯ��ȡ��ҳ������ page->��ѯ��pageҳ rows->��ѯҳ����rows��
//     */
//    @SuppressWarnings("unchecked")
//    public List<T> find(String hql, int page, int rows) {
//        Query q = this.createQuery(hql);
//        return q.setFirstResult((page - 1) * rows).setMaxResults(rows).list();
//    }
//
//    /*
//     * hql��ѯ��ȡ��ҳ������ ֧�ֲ�����map���� page->��ѯ��pageҳ rows->��ѯҳ����rows��
//     */
//    @SuppressWarnings("unchecked")
//    public List<T> find(String hql, Map<String, Object> params, int page,
//            int rows) {
//        Query q = this.createQueryWithParams(hql, params);
//        return q.setFirstResult((page - 1) * rows).setMaxResults(rows).list();
//    }
//
//    /*
//     * hql��ѯ��ȡƥ����
//     */
//    public int count(String hql) {
//        Query q = this.createQuery(hql);
//        return ((Long) q.uniqueResult()).intValue();
//    }
//
//    /*
//     * hql��ѯ��ȡƥ���� ֧�ֲ�����map����
//     */
//    public int count(String hql, Map<String, Object> params) {
//        Query q = this.createQueryWithParams(hql, params);
//        return ((Long) q.uniqueResult()).intValue();
//    }
//
//    /*
//     * 
//     */
//    public Serializable save(T o) {
//        return this.getSession().save(o);
//    }
//
//    public void saveOrUpdate(T obj) {
//        Session session = this.getSession();
//        session.saveOrUpdate(obj);
//    }
//
//    public void insert(T o) {
//        Session session = this.getSession();
//        session.save(o);
//    }
//
//    public void insert(List<T> objs) {
//        Session session = this.getSession();
//        for (T obj : objs) {
//            session.save(obj);
//        }
//    }
//
//    public void update(T o) {
//        Session session = this.getSession();
//        session.update(o);
//    }
//
//    public void update(List<T> objs) {
//        Session session = this.getSession();
//        for (T obj : objs) {
//            session.update(obj);
//        }
//    }
//
//    public void delete(T o) {
//        Session session = this.getSession();
//        session.delete(o);
//    }
//
//    public void delete(Class<T> clazz, Long id) {
//        Session session = this.getSession();
//        Object obj = session.get(clazz, id);
//        session.delete(obj);
//    }
//
//    public void delete(Class<T> clazz, Long[] ids) {
//        Session session = this.getSession();
//        for (Long id : ids) {
//            T o = this.get(clazz, id);
//            session.delete(o);
//        }
//        session.flush();
//    }
//
//    public void delete(Class<T> clazz, List<Long> ids) {
//        Session session = this.getSession();
//        for (Long id : ids) {
//            T o = this.get(clazz, id);
//            session.delete(o);
//        }
//        session.flush();
//    }
//
//    public void updateCondition(String hql, Map<String, Object> params) {
//        Query q = this.createQueryWithParams(hql, params);
//        q.executeUpdate();
//    }
//
//    public void deleteCondition(String hql, Map<String, Object> params) {
//        Query q = this.createQueryWithParams(hql, params);
//        q.executeUpdate();
//    }
//
//    /*
//     * ����Hql������ѯ
//     */
//    public Query createQuery(String hql) {
//        return this.getSession().createQuery(hql);
//    }
//
//    /*
//     * ����Sql������ѯ
//     */
//    public Query createSQLQuery(String sql) {
//        return this.getSession().createSQLQuery(sql);
//    }
//
//    /**
//     * ����Map����������ѯ
//     * 
//     * @param hql
//     * @param params
//     * @return
//     */
//    public Query createQueryWithParams(String hql, Map<String, Object> params) {
//        Query q = this.createQuery(hql);
//        if ((params != null) && !params.isEmpty()) {
//            for (String key : params.keySet()) {
//                q.setParameter(key, params.get(key));
//            }
//        }
//        return q;
//    }
//
//    // ---------------��Ԫ���ѯ - append by liuchchc 2014-6-19 21:08:11----------
//    /**
//     * ��������ƴHql��ѯ���
//     * 
//     * @param clazz
//     * @param parsedQuery
//     *            ��ѯ������Ԫ��
//     * @return HQL���
//     */
//    public String getTripleHql(Class<T> clazz,
//            List<Triple<String, ClientOperation, String>> parsedQuery) {
//        return this.getTripleHql(clazz, parsedQuery, false);
//    }
//
//    /**
//     * ��������ƴHql��ѯ���
//     * 
//     * @param clazz
//     * @param parsedQuery
//     *            ��ѯ������Ԫ��
//     * @param isCount
//     *            �Ƿ���count��ʽ��ѯ����
//     * @return HQL���
//     */
//    public String getTripleHql(Class<T> clazz,
//            List<Triple<String, ClientOperation, String>> parsedQuery,
//            boolean isCount) {
//        StringBuilder hql = new StringBuilder("select");
//        if (isCount) {
//            hql.append(" count(o)");
//        }
//        else {
//            hql.append(" o");
//        }
//        hql.append(" from " + clazz.getName() + " o");
//
//        hql.append(HqlUtil.getHqlWhere("o", parsedQuery));
//
//        return hql.toString();
//    }
}
