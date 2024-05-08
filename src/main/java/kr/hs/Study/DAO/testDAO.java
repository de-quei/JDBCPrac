package kr.hs.Study.DAO;

import kr.hs.Study.DTO.testDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

// 실제 CRUD를 실행하는 곳 : 메서드 형식으로 실행
@Component
public class testDAO {
    @Autowired
    private JdbcTemplate jdbc; //jdbc : beanconfigclass에서 만든 jdbctemplate 객체 주소가 들어가있음!

    // INSERT
    public void insert(testDTO dto) {
        String sql = "INSERT INTO test VALUES(?, ?)";
        jdbc.update(sql, dto.getId(), dto.getName());
    }
}
