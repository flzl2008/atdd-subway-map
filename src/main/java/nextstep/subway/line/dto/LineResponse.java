package nextstep.subway.line.dto;

import nextstep.subway.line.domain.Line;
import nextstep.subway.station.domain.Station;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class LineResponse {
    private Long id;
    private String name;
    private String color;
    private List<Station> stations;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public LineResponse() {
    }

    public LineResponse(Long id, String name, String color, LocalDateTime createdDate, LocalDateTime modifiedDate, List<Station> stations) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.stations = stations;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public List<Station> getStations() {
        return stations;
    }

    public static LineResponse of(Line line) {
        return new LineResponse(line.getId(), line.getName(), line.getColor(), line.getCreatedDate(), line.getModifiedDate(), line.getSortedStations());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineResponse that = (LineResponse) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(color, that.color) && Objects.equals(createdDate, that.createdDate) && Objects.equals(modifiedDate, that.modifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color, createdDate, modifiedDate);
    }
}
