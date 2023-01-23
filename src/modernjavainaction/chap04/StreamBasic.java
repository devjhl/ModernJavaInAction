package modernjavainaction.chap04;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.List;

public class StreamBasic {

	public static void main(String[] args) {
		
		getLowCaloricDishesNamesInJava8(Dish.menu).forEach(System.out::println);
	}
	
	public static List<String> getLowCaloricDishesNamesInJava8(List<Dish> dishes) {
	    return dishes.stream()
	        .filter(d -> d.getCalories() < 400) // 400 칼로리 이하의 요리 선택
	        .sorted(comparing(Dish::getCalories)) // 칼로리로 요리정렬
	        .map(Dish::getName) // 요리명 추출
	        .collect(toList()); // 모든 요리명을 리스트에 저장
	
	}
	
	
}
