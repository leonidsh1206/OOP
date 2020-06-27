package ru.shakov.lesson8.part3;

public class Main {
    public static void main(String[] args) {

        Contract contract = new Contract(123,"26/06/2020", new String[]{"Position1", "Position2"});

        System.out.printf("%s\n", contract);

        // следующий код необходимо вынести в отдельный сласс с методом,
        // который будет конвертировать Contract в Act

        Act act = new Act(0,"",new String[]{"",""});

            act.setActNumber(contract.getContractNumber());
            act.setActDate(contract.getContractDate());
            act.setActS(contract.getContractS());

        System.out.printf("%s", act);

    }
}
