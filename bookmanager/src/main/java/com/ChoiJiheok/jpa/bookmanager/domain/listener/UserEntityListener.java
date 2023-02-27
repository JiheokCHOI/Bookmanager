package com.ChoiJiheok.jpa.bookmanager.domain.listener;

import com.ChoiJiheok.jpa.bookmanager.domain.UserHistory;
import com.ChoiJiheok.jpa.bookmanager.domain.User;
import com.ChoiJiheok.jpa.bookmanager.repository.UserHistoryRepository;
import com.ChoiJiheok.jpa.bookmanager.support.BeanUtils;
import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;

public class UserEntityListener {
    @PostPersist
    @PostUpdate
    public void prePersistAndPreUpdate(Object o) {
        UserHistoryRepository userHistoryRepository = BeanUtils.getBean(UserHistoryRepository.class);

        User user = (User) o;

        UserHistory userHistory = new UserHistory();
        userHistory.setName(user.getName());
        userHistory.setEmail(user.getEmail());
        userHistory.setUser(user);
        userHistory.setHomeAddress(user.getHomeAddress());
        userHistory.setCompanyAddress(user.getCompanyAddress());

        userHistoryRepository.save(userHistory);
    }
}
