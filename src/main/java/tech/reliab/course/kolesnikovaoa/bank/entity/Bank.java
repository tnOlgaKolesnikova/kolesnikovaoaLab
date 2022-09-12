package tech.reliab.course.kolesnikovaoa.bank.entity;

import lombok.Data;
import tech.reliab.course.kolesnikovaoa.bank.utils.RandomGenerator;

@Data
public class Bank {
    /**
     * Поле Id банка
     */
    private int bankId;

    /**
     * Поле Имя банка
     */
    private String bankName;

    /**
     * Поле Кол-во офисов (заполняется и считается автоматически при добавлении
     * нового офиса), по умолчанию 0
     */
    private int bankOfficeCount;

    /**
     * Поле Кол-во банкоматов (заполняется и считается автоматически при
     * добавлении нового банкомата), по умолчанию
     */
    private int bankAtmCount;

    /**
     * Поле Кол-во сотрудников (заполняется и считается автоматически при
     * добавлении нового сотрудника), по умолчанию 0
     */
    private int bankEmployeeCount;

    /**
     * Кол-во клиентов (заполняется и считается автоматически при добавлении
     * нового клиента в банк), по умолчанию 0
     */
    private int bankUserCount;

    /**
     * Рейтинг банка (генерируется рандомно, от 0 до 100, где 100 наивысший
     * балл, чем выше рейтинг банка, тем меньше должна быть процентная ставка)
     */
    private int bankRating;

    /**
     * Всего денег в банке (генерируется рандомно, но не более 1 000 000)
     */
    private int bankMoneyCount;

    /**
     * Процентная ставка (генерируется рандомно, но не более 20%, однако
     * нужно учитывать рейтинг банка, чем он выше, тем ставка должна
     * сгенерироваться меньше)
     */
    private int bankRate;

    /**
     * Конструктор создание нового объекта банк
     *
     * @param bankId   Id банка
     * @param bankName Имя банка
     */
    public Bank(int bankId, String bankName) {
        this.bankId = bankId;
        this.bankName = bankName;
        this.bankOfficeCount = 0;
        this.bankAtmCount = 0;
        this.bankEmployeeCount = 0;
        this.bankUserCount = 0;
        this.bankRating = RandomGenerator.generateInt(1, 100);
        this.bankMoneyCount = RandomGenerator.generateInt(1, 1000000);
        this.bankRate = RandomGenerator.generateRateUseRating(1, 20, this.bankRating);
    }

    @Override
    public String toString() {
        return "Банк " + this.bankName + " содержит:\n" +
                this.bankOfficeCount + " офис(ов), " + this.bankAtmCount + " банкомат(ов) " +
                this.bankEmployeeCount + " сотрудников. И обслуживает " + this.bankUserCount + " клиентов.\n" +
                "Рейтинг банка: " + this.bankRating + " при ставке в " + this.bankRate + "%.\n" +
                "Суммарно на счетах и в банкоматах " + this.bankMoneyCount + " рублей 0 копеек\n";
    }
}

