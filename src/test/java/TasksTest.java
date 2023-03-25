import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    public void shouldFindMatchesInSimpleTask() {

        SimpleTask task = new SimpleTask(5, "Сходить в магазин");

        boolean expected = true;
        boolean actual = task.matches("магазин");
        assert expected == actual;

    }

    @Test
    public void shouldFindMatchesInEpic() {

        String[] subtasks = {"Молоко", "Яйца", "Хлеб", "Помидоры", "Лук"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Лук");
        assert expected == actual;

    }

    @Test
    public void shouldFindMatchesInMeeting() {
        Meeting meeting = new Meeting(
                555,
                "Сделать одиннадцатое дз",
                "Курс QA от Нетологии",
                "Завтра до обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("Нетоло");
        assert expected == actual;
    }

}
