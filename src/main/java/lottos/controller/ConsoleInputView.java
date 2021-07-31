package lottos.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConsoleInputView {

    private final Scanner scanner = new Scanner(System.in);

    public int buy() {
        System.out.println("구입금액을 입력해 주세요.");
        int result = Integer.parseInt(scanner.nextLine());
        System.out.println(String.format("%d개를 구매했습니다.", result / 1000));
        return result;
    }

    public List<Integer> lastWeeksWinningNumbers() {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        String text = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(text.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return numbers;
    }
}
