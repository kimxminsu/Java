
public class Test05 {
	public static void main(String[] args) {
		String name="해피";
		int age=2;
		double weight=3.5;
		char animalCode='D';
		boolean isVaccinated=false;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(weight);
		System.out.println(animalCode);
		System.out.println(isVaccinated);
		
		System.out.println("이름="+name);
		System.out.println("나이="+age);
		System.out.println("체중="+weight);
		System.out.println("동물코드="+animalCode);
		System.out.println("백신접종여부="+isVaccinated);
		
		System.out.printf("이름=%s, 나이=%ㅇ, 체중=%.2f\n", name, age, weight);
		System.out.printf("동물코드=%c, 백신접종여부=%b", animalCode, isVaccinated);
	}
}
