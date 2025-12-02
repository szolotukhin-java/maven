package ua.in.sz.swing;

import ch.qos.logback.core.PropertyDefinerBase;

public class TidPropertyDefiner extends PropertyDefinerBase {
    @Override
    public String getPropertyValue() {
        return Long.toString(Thread.currentThread().getId());
    }
}