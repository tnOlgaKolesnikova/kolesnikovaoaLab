package tech.reliab.course.toropchinda.bank.service;

import tech.reliab.course.toropchinda.bank.entity.Bank;

public interface BankService {
    /**
     * Получение банка по id
     * @param id
     * @return объект банка или null
     */
    Bank getBank(int id);

    /**
     * Получение банка по имени
     * @param name
     * @return объект банка или null
     */
    Bank getBank(String name);

    /**
     * Открыть банк с переданным именем
     * @param name
     */
    Bank openBank(String name);

    /**
     * Закрыть банк с указанным именем
     * @param name
     */
    void closeBank(String name);

    /**
     * Оповещает банк об открытии нового офиса(увеличивает счётчик офисов)
     * @param name имя банка, которому надо увеличить счётчик
     */
    void addOfficeInBank(String name);

    /**
     * Оповещает банк о закрытии офиса(уменьшает счётчик офисов)
     * @param name
     */
    void closeOfficeInBank(String name);
}
