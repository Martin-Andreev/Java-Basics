import java.time.LocalDateTime;

public class _05_CurrentDateTime {
	public static void main(String[] args) {
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.printf("Current date and time: %s", currentTime.toString());
	}
}
