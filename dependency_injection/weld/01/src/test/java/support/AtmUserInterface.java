/***
 * Excerpted from "The Cucumber for Java Book",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/srjcuc for more book information.
***/
package support;


import nicebank.Account;
import nicebank.Teller;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;

@Singleton
public class AtmUserInterface implements Teller {

    private final EventFiringWebDriver webDriver;

    @Inject
    public AtmUserInterface(MyWebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void withdrawFrom(Account account, int amount) {
            webDriver.get("http://localhost:" + hooks.ServerHooks.PORT);
            webDriver.findElement(By.id("amount")).sendKeys(String.valueOf(amount));
            webDriver.findElement(By.id("withdraw")).click();
    }
}
