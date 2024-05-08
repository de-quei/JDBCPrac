package kr.hs.Study.Config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = {"kr.hs.Study.Beans","kr.hs.Study.DAO", "kr.hs.Study.DTO"})
public class BeanConfigClass {
    //Datasource
    @Bean
    public BasicDataSource source() {
        BasicDataSource source = new BasicDataSource();
        source.setDriverClassName("oracle.jdbc.OracleDriver");
        source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        source.setUsername("SCOTT");
        source.setPassword("tiger");

        return source;
    }

    @Bean
    public JdbcTemplate db(BasicDataSource source) {
        JdbcTemplate db = new JdbcTemplate(source);
        return db;
    }
}