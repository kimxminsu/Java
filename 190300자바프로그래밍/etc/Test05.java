
public class Test05 {
	public static void main(String[] args) {
		String name="����";
		int age=2;
		double weight=3.5;
		char animalCode='D';
		boolean isVaccinated=false;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(weight);
		System.out.println(animalCode);
		System.out.println(isVaccinated);
		
		System.out.println("�̸�="+name);
		System.out.println("����="+age);
		System.out.println("ü��="+weight);
		System.out.println("�����ڵ�="+animalCode);
		System.out.println("�����������="+isVaccinated);
		
		System.out.printf("�̸�=%s, ����=%��, ü��=%.2f\n", name, age, weight);
		System.out.printf("�����ڵ�=%c, �����������=%b", animalCode, isVaccinated);
	}
}
