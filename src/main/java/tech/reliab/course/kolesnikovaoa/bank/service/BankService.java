package tech.reliab.course.kolesnikovaoa.bank.service;

import tech.reliab.course.kolesnikovaoa.bank.entity.Bank;

public interface BankService {

    /**
     * Открыть банк с переданным именем
     * @param name имя банка, который нужно создать
     */
    Bank createBank(String name);

    /**
     * Записать в коллекцию в сервисе созданный где-то отдельно банк
     * @param bank
     */
    void addBank(Bank bank);

    /**
     * Получение банка по id
     * @param id объекта банка
     * @return объект банка или null
     */
    Bank getBank(int id);

    /**
     * Получение банка по имени
     * @param name объекта банка
     * @return объект банка или null
     */
    Bank getBank(String name);

    /**
     * Обновить информацию о банке
     * @param bank
     */
    void updateBank(Bank bank);

    /**
     * Закрыть банк с указанным именем
     * @param name имя банка, который нужно удалить
     */
    void deleteBank(String name);
}
