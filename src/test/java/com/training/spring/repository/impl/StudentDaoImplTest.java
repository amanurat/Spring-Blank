package com.training.spring.repository.impl;

import com.training.spring.repository.StudentDao;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@Transactional
public class StudentDaoImplTest {

    @Autowired
    private StudentDao studentDao;


}