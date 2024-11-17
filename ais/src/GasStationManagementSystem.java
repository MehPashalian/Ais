import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class GasStationManagementSystem {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GasStationManagementSystem::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("АИС для сети автозаправок");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Таблица запрашивающих станций
        String[] gasStationColumnNames = {"ID", "Название", "Адрес", "Тип топлива"};
        Object[][] gasStationData = {
                {1, "АЗС 1", "ул. Ленина, д. 1", "Бензин"},
                {2, "АЗС 2", "ул. Пушкина, д. 2", "Дизель"},
                {3, "АЗС 3", "ул. Гоголя, д. 3", "Газ"},
                {4, "АЗС 4", "пр. Мира, д. 4", "Бензин"},
                {5, "АЗС 5", "ул. Невского, д. 5", "Дизель"},
                {6, "АЗС 6", "ул. Грибоедова, д. 6", "Газ"},
                {7, "АЗС 7", "ул. Достоевского, д. 7", "Бензин"},
                {8, "АЗС 8", "ул. Чехова, д. 8", "Дизель"},
                {9, "АЗС 9", "ул. Крылатская, д. 9", "Газ"},
                {10, "АЗС 10", "ул. Островского, д. 10", "Бензин"}
        };
        JTable gasStationTable = new JTable(new DefaultTableModel(gasStationData, gasStationColumnNames));
        tabbedPane.addTab("Заправочные станции", new JScrollPane(gasStationTable));

        // Таблица топлива
        String[] fuelColumnNames = {"ID", "Тип", "Цена за литр", "Запас (литры)"};
        Object[][] fuelData = {
                {1, "Бензин", "$1.20", 2000},
                {2, "Дизель", "$1.25", 1500},
                {3, "Газ", "$0.90", 3000},
                {4, "Бензин-95", "$1.30", 1800},
                {5, "Бензин-98", "$1.40", 1600},
                {6, "Керосин", "$1.50", 1200},
                {7, "Этанол", "$1.10", 2200},
                {8, "Пропан", "$0.85", 3000},
                {9, "Метан", "$0.80", 3500},
                {10, "Смесь Бензина", "$1.60", 1000}
        };
        JTable fuelTable = new JTable(new DefaultTableModel(fuelData, fuelColumnNames));
        tabbedPane.addTab("Топливо", new JScrollPane(fuelTable));

        // Таблица клиентов
        String[] clientColumnNames = {"ID", "ФИО", "Номер телефона", "Номер карты лояльности"};
        Object[][] clientData = {
                {1, "Иванов Иван", "+7 999 123 45 67", "123456"},
                {2, "Петров Петр", "+7 999 234 56 78", ""},
                {3, "Сидоров Сидор", "+7 999 345 67 89", "654321"},
                {4, "Кузнецов Алексей", "+7 999 456 78 90", ""},
                {5, "Смирнова Анна", "+7 999 567 89 01", "987654"},
                {6, "Ковалев Виктор", "+7 999 678 90 12", ""},
                {7, "Федорова Екатерина", "+7 999 789 01 23", "456789"},
                {8, "Дорогина Светлана", "+7 999 890 12 34", ""},
                {9, "Николаев Сергей", "+7 999 901 23 45", "234567"},
                {10, "Сергеева Юлия", "+7 999 012 34 56", ""}
        };
        JTable clientTable = new JTable(new DefaultTableModel(clientData, clientColumnNames));
        tabbedPane.addTab("Клиенты", new JScrollPane(clientTable));

        // Таблица транзакций
        String[] transactionColumnNames = {"ID", "Дата/время", "Сумма", "Количество литров", "ID заправочной станции", "ID клиента"};
        Object[][] transactionData = {
                {1, "2024-11-17 10:00", "$25.00", 20, 1, 1},
                {2, "2024-11-17 11:30", "$30.00", 24, 2, 2},
                {3, "2024-11-17 12:15", "$9.00", 10, 3, 3},
                {4, "2024-11-17 13:00", "$45.00", 35, 4, 4},
                {5, "2024-11-17 14:30", "$15.00", 12, 5, 5},
                {6, "2024-11-17 15:20", "$20.00", 15, 6, 6},
                {7, "2024-11-17 16:50", "$50.00", 40, 7, 7},
                {8, "2024-11-17 17:30", "$10.00", 8, 8, 8},
                {9, "2024-11-17 18:10", "$60.00", 50, 9, 9},
                {10, "2024-11-17 19:45", "$35.00", 28, 10, 10}
        };
        JTable transactionTable = new JTable(new DefaultTableModel(transactionData, transactionColumnNames));
        tabbedPane.addTab("Транзакции", new JScrollPane(transactionTable));

        // Таблица карт оплаты
        String[] cardPaymentColumnNames = {"ID", "Номер карты", "Срок действия", "ID клиента"};
        Object[][] cardPaymentData = {
                {1, "4111 1111 1111 1111", "12/25", 1},
                {2, "5222 2222 2222 2222", "01/24", 3},
                {3, "6011 1111 1111 1117", "11/23", 2},
                {4, "3714 4963 5400 001", "06/26", 5},
                {5, "3782 8224 6310 005", "09/26", 6},
                {6, "3425 1825 8924 003", "05/25", 7},
                {7, "6011 1234 5678 9010", "10/23", 8},
                {8, "4444 4444 4444 4444", "04/24", 9},
                {9, "5555 5555 5555 4444", "08/25", 10},
                {10, "8888 8888 8888 8888", "12/24", 4}
        };
        JTable cardPaymentTable = new JTable(new DefaultTableModel(cardPaymentData, cardPaymentColumnNames));
        tabbedPane.addTab("Карты оплаты", new JScrollPane(cardPaymentTable));

        frame.add(tabbedPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
