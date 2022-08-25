package insert;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test04 {
	public static void main(String[] args) {
		//포켓몬스터 테이블(pocket_monster) 테이블에 데이터를 등록할 수 있도록 구현
		Scanner sc = new Scanner(System.in);
		//변수
		System.out.print("번호 : ");
		int no = sc.nextInt();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("속성 : ");
		String type = sc.next();
		sc.close();
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("khacademy");
		dataSource.setPassword("khacademy");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe"); //연결타입
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		
		JdbcTemplate template = new JdbcTemplate(dataSource);
		
		String sql = "insert into pocket_monster(no, name, type)"
				+ "values(?, ?, ?)";
		
		Object[] param = {no, name, type};
		
		template.update(sql, param);
		
		System.out.println("완료!");
	}
}
