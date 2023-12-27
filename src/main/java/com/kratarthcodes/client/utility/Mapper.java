package com.kratarthcodes.client.utility;

import com.kratarthcodes.client.entity.User;
import com.kratarthcodes.client.model.UserModel;

public class Mapper {

    public static UserModel userEntityToModel(User user){
        UserModel userModel = new UserModel();
        userModel.setId(user.getId());
        userModel.setFirstName(user.getFirstName());
        userModel.setLastName(user.getLastName());
        userModel.setPassword(user.getPassword());
        userModel.setJobProfile(user.getJobProfile());
        return userModel;
    }

    public static User userModelToEntity(UserModel userModel){
        User user = new User();
        user.setId(userModel.getId());
        user.setFirstName(userModel.getFirstName());
        user.setLastName(userModel.getLastName());
        user.setPassword(userModel.getPassword());
        user.setJobProfile(userModel.getJobProfile());
        return user;
    }
}
