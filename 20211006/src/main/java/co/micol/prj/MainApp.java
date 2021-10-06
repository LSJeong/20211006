package co.micol.prj;

import java.util.HashMap;
import java.util.Map;

import co.micol.prj.vo.Bicle;
import co.micol.prj.vo.Car;
import co.micol.prj.vo.Command;
import co.micol.prj.vo.DevVO;

//import java.util.ArrayList;
//import java.util.List;
//
//import co.micol.prj.vo.DevVO;

public class MainApp {
//	private static DevVO vo; // VO 객체 인스턴스 정의
//	private static MapTest mapTest;
	
	private static Map<String, Command> map = new HashMap<String, Command>(); //map에 인터페이스 넣기(예제: line96부터)
	
	public static void main(String[] args) {
		 //List 인터페이스 객체(자기자신 인스턴스 생성 못함), 하위객체인 ArrayList으로 만들어준다
//		List<DevVO> list = new ArrayList<DevVO>();
//		vo = new DevVO(); // 객체 초기화
//		vo.setId(1);
//		vo.setName("홍길동");
//		vo.setAddress("대구광역시 중구");
//		vo.setAge(23);
//
//		list.add(vo); // 리스트 구조에 하나를 추가
//
//		vo = new DevVO(); // 객체 초기화
//		vo.setId(2);
//		vo.setName("홍길순");
//		vo.setAddress("대구광역시 서구");
//		vo.setAge(23);
//
//		list.add(vo);
//
//		System.out.println(list.get(0).getId());
//		System.out.println(list.get(0).getName());
//		System.out.println(list.get(0).getAddress());
//		System.out.println(list.get(0).getAge());
//		System.out.println("========================");
//		list.get(1).toString(); // list가 가지고있는 요소를 출력한다.
//		System.out.println("========================");
//		
//		for (int i = 0; i < list.size(); i++) { //list 전체를 출력
//			list.get(i).toString();
//		}
//		
//		System.out.println("==========전체가져오기==========");
//		
//		for(DevVO vo : list) { //list 전체 가져오기
//			vo.toString();
//		}
		
//		mapTest = new MapTest();
//		mapTest.setMap("micol", "1234");
//		mapTest.setMap("park", "2345");
//		mapTest.setMap("lee", "5678");
//		mapTest.setMap("kim", "0912");
//		
//		String pw = mapTest.getMap("micol");
//		System.out.println(pw);
//		
//		Map<String, Integer> map = new HashMap<String, Integer>(); //<객체, 객체>가 와야함, int -> Integer
//		map.put("age", 23);
//		map.put("id", 6);
//		
//		int age = map.get("age");
//		System.out.println(age);
//		System.out.println(map.get("id"));
		
//		Map<String, DevVO> mapVo = new HashMap<String, DevVO>();
//		DevVO vo = new DevVO();
//		vo.setId(1);
//		vo.setName("홍길동");
//		vo.setAddress("서울");
//		vo.setAge(20);
//		
//		mapVo.put("홍길동", vo);
//		
//		vo = new DevVO();
//		vo.setId(2);
//		vo.setName("박수동");
//		vo.setAddress("대구");
//		vo.setAge(23);
//		
//		mapVo.put("박수동", vo);
//		
//		DevVO vo1 = new DevVO();
//		vo1 = mapVo.get("박수동");
//		vo1.toString();
		
		map.put("car", new Car());
		map.put("Bicle", new Bicle());
		
		Command command = map.get("car");
		command.run();
	}

}
