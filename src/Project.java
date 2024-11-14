import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Project {
	public static void main(String[] args)
			throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<Marine> marineList = new ArrayList<>();
		
		boolean isContinue = true;
		
		while (isContinue) {
			int choice;
			
			System.out.print("Привет, Евгеджон, введи цифру (1 - добавить корабль, 2 - вывести список, 3 - выйти): ");
			choice = Integer.parseInt(reader.readLine());
			
			switch (choice) {
			case 1:
				System.out.print("Введите название военной части: ");
                String name = reader.readLine();
                System.out.print("Введите название корабля: ");
                String shipName = reader.readLine();
                System.out.print("Введите тип корабля: ");
                String shipType = reader.readLine();
                System.out.print("Введите дату проведения учений: ");
                LocalDate educationDate = LocalDate.parse(reader.readLine());
                System.out.print("Введите наработку корабля: ");
                int workTime = Integer.parseInt(reader.readLine());
                System.out.print("Введите количество экипажа: ");
                int personalCount = Integer.parseInt(reader.readLine());
                System.out.print("Введите место проведения учений: ");
                String educationLocation = reader.readLine();
                System.out.print("Введите результат учений: ");
                String educationResult = reader.readLine();
				Marine marine = new Marine
						(
								name,
								shipName,
								shipType,
								educationDate,
								workTime,
								personalCount,
								educationLocation,
								educationResult
						);
				marineList.add(marine);
				System.out.println("Запись добавлена!");
				break;
			case 2:
				if (marineList.isEmpty()) {
                    System.out.println("Список кораблей пуст.");
                } else {
                	marineList.sort(Comparator.comparing(Marine::getName));
                	for (int i = 0; i < marineList.toArray().length; i++) {
                		System.out.println(marineList.get(i).toString());
                	}
                }
				break;
			case 3:
				isContinue = false;
				break;
			}
		}
	}
}
