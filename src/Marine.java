import java.time.LocalDate;
import java.time.LocalDateTime;

public class Marine {
	public Marine(
			String name,
			String shipName,
			String shipType,
			LocalDate educationDate,
			int workTime,
			int personalCount,
			String educationLocation,
			String educationResult) {
		setName(name);
		setShipName(shipName);
		setShipType(shipType);
		setEducationDate(educationDate);
		setWorkTime(workTime);
		setPersonalCount(personalCount);
		setEducationLocation(educationLocation);
		setEducationResult(educationResult);
	}
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String value) {
		name = value;
	}
	
	private String shipName;
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String value) {
		shipName = value;
	}
	
	private String shipType;
	public String getShipType() {
		return shipType;
	}
	public void setShipType(String value) {
		shipType = value;
	}
	
	private LocalDate educationDate;
	public LocalDate getEducationDate() {
		return educationDate;
	}
	public void setEducationDate(LocalDate value) {
		educationDate = value;
	}
	
	private int workTime;
	public int getWorkTime() {
		return workTime;
	}
	public void setWorkTime(int value) {
		workTime = value;
	}
	
	private int personalCount;
	public int getPersonalCount() {
		return personalCount;
	}
	public void setPersonalCount(int value) {
		personalCount = value;
	}
	
	private String educationLocation;
	public String getEducationLocation() {
		return educationLocation;
	}
	public void setEducationLocation(String value) {
		educationLocation = value;
	}
	
	private String educationResult;
	public String getEducationResult() {
		return educationResult;
	}
	public void setEducationResult(String value) {
		educationResult = value;
	}
	
	@Override
	public String toString() {
		return
				"Название военной части: " + getName() + "\r\n" +
				"Название корабля: " + getShipName() + "\r\n" +
				"Тип корабля: " + getShipType() + "\r\n" +
				"Дата проведения учения: " + getEducationDate() + "\r\n" +
				"Наработка корабля: " + getWorkTime() + "\r\n" +
				"Количество личного состава: " + getPersonalCount() + "\r\n" +
				"Место проведения учений: " + getEducationLocation() + "\r\n" +
				"Результат учений: " + getEducationResult() + "\r\n";
	}
}
