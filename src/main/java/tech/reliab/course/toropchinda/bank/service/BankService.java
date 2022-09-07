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
     * Открыть банк с переданным именем// create
     * @param name имя банка, который нужно создать
     */
    Bank addBank(String name);

    /**
     * Закрыть банк с указанным именем// delete
     * @param name имя банка, который нужно удалить
     */
    void deleteBank(String name);

    /**Обновить информацию о банке
     *
     * @param banks
     */
    void updateBank(Bank banks);


    /**
     * Оповещает банк об открытии нового офиса(увеличивает счётчик офисов)
     * @param name имя банка, которому надо увеличить счётчик
     */
    void addOfficeInBank(String name);

    /**
     * Оповещает банк о закрытии офиса(уменьшает счётчик офисов)
     * @param name
     */
    void deleteOfficeInBank(String name);

    /**
     * Оповещает банк об установке нового банкомата (увеличивает счетчик)
     * @param name
     */
    void addBankAtm(String name);

    /**
     * Оповещает банк о демонтаже банкомата (уменьшает счетчик)
     * @param name
     */
  void deleteAtmInBank(String name);


}
