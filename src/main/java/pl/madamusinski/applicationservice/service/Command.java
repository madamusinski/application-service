package pl.madamusinski.applicationservice.service;

public interface Command<S> {

    S execute();
}
