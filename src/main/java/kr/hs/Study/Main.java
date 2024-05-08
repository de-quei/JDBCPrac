package kr.hs.Study;

import kr.hs.Study.Config.BeanConfigClass;
import kr.hs.Study.DAO.testDAO;
import kr.hs.Study.DTO.testDTO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
        //1. testDAO 가지고 와서 dao에 대입하기
        testDAO dao = ctx.getBean(testDAO.class);

        //2. testDTO 객체 t1 만들기
        testDTO t1 = new testDTO();

        //3. t1에 1, kim 넣기
        t1.setId(1);
        t1.setName("kim");

        //4. dao의 insert() 호출하기
        dao.insert(t1);

        System.out.println("Data inserted successfully.");

        ctx.close();
    }
}