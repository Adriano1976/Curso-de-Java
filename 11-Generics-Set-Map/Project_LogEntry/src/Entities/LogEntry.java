package Entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {

    private String username;
    private Date moment;

    public LogEntry() {
    }

    public LogEntry(String username, Date moment) {
        this.username = username;
        this.moment = moment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    // Primeiro hashCode. Se der igual, usa equals para confirmar

    @Override
    public boolean equals(Object object) { // equals: lento, resposta 100%
        if (this == object) return true;
        if (!(object instanceof LogEntry logEntry)) return false;
        return getUsername().equals(logEntry.getUsername());
    }

    @Override
    public int hashCode() { // hashCode: rápido, porém resposta positiva não é 100%
        return Objects.hash(getUsername());
    }
}
