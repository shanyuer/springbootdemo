package com.haiziyouke.db;

import com.haiziyouke.db.dao.PlatformUserDAO;
import com.haiziyouke.db.dao.ThirdLoginDAO;
import com.haiziyouke.db.dao.UserDAO;
import org.apache.commons.lang.ArrayUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * Created by danbai on 17/5/2.
 */
@Configuration
public class MyBatisConfig {

    @Bean
    public PlatformTransactionManager transactionManager(DataSource datasource) {
        return new DataSourceTransactionManager(datasource);
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource datasource, ResourceLoader resourceLoader) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(datasource);
        ResourcePatternResolver rpr = ResourcePatternUtils.getResourcePatternResolver(resourceLoader);
        Resource[] configResource = rpr.getResources("classpath*:mybatis/sqlMapConfig.xml");
        if (ArrayUtils.isNotEmpty(configResource)) {
            factoryBean.setConfigLocation(configResource[0]);
        }
        Resource[] mapperResource = rpr.getResources("classpath*:mybatis/mapping/*.xml");
        factoryBean.setMapperLocations(mapperResource);

        return factoryBean.getObject();
    }

    private <T> T getMapper(SqlSessionFactory sqlSessionFactory, Class<T> mapperInterface) throws Exception {
        MapperFactoryBean<T> mapperFactoryBean = new MapperFactoryBean<T>();
        try {
            mapperFactoryBean.setSqlSessionFactory(sqlSessionFactory);
            mapperFactoryBean.setMapperInterface(mapperInterface);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return mapperFactoryBean.getObject();
    }

    @Bean
    @Autowired
    public UserDAO userDAO(SqlSessionFactory sqlSessionFactory) throws Exception {
        return (UserDAO)getMapper(sqlSessionFactory, UserDAO.class);
    }
    @Bean
    @Autowired
    public PlatformUserDAO platformUserDAO(SqlSessionFactory sqlSessionFactory) throws Exception {
        return (PlatformUserDAO)getMapper(sqlSessionFactory, PlatformUserDAO.class);
    }
    @Bean
    @Autowired
    public ThirdLoginDAO thirdLoginDAO(SqlSessionFactory sqlSessionFactory) throws Exception {
        return (ThirdLoginDAO)getMapper(sqlSessionFactory, ThirdLoginDAO.class);
    }

}
