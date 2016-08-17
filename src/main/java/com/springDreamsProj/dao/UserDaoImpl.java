package com.springDreamsProj.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.springDreamsProj.model.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {

	public User findById(int id) {
		return getByKey(id);
	}

	public User findByUserName(String userName) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("userName", userName));
		return (User) crit.uniqueResult();
	}

	public List<User> findUserList() {
		Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
		logger.info("jaison reached in findUserList");
		Query qry=getSession().getNamedQuery("getAllUser");
		qry.setCacheable(true);
		List<User> userList=qry.list();
		return userList;
	}

	
}
