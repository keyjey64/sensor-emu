package com.sensor_emu.model;

import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

import java.util.Objects;

public class AbstractConfigurableEntity {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private long id;

    @ColumnInfo(name = "value")
    private int value;

    @ColumnInfo(name = "ts")
    private long timestamp;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(final int value) {
        this.value = value;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(final long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final AbstractConfigurableEntity that = (AbstractConfigurableEntity) o;
        return id == that.id &&
                Float.compare(that.value, value) == 0 &&
                Double.compare(that.timestamp, timestamp) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value, timestamp);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "id=" + id +
                ", value=" + value +
                ", timestamp=" + timestamp +
                '}';
    }
}
