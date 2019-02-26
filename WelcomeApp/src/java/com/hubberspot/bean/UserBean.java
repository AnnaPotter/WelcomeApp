
package com.hubberspot.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Anna
 */
@ManagedBean
@SessionScoped
public class UserBean {

    public UserBean() {
    }
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String display() {
        return "display";
    }
    
}
