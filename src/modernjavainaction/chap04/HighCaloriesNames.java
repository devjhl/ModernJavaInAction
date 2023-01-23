package modernjavainaction.chap04;

import static java.util.stream.Collectors.toList;
import static modernjavainaction.chap04.Dish.menu;

import java.util.List;

public class HighCaloriesNames {

	public static void main(String[] args) {
		List<String> threeHighCaloriDishNames = 
			menu.stream()
			.filter(dish -> dish.getCalories() > 300)
			.map(Dish::getName)
			.limit(3) // 선착순 세 개만 선택
			.collect(toList()); // 결과를 다른 리스트로 저장
		
		System.out.println(threeHighCaloriDishNames);
	}

}
