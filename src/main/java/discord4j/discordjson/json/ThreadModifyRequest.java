package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableThreadModifyRequest.class)
@JsonDeserialize(as = ImmutableThreadModifyRequest.class)
public interface ThreadModifyRequest {

    static ImmutableThreadModifyRequest.Builder builder() {
        return ImmutableThreadModifyRequest.builder();
    }

    Possible<String> name();

    Possible<Boolean> archived();

    @JsonProperty("auto_archive_duration")
    Possible<Integer> autoArchiveDuration();

    Possible<Boolean> locked();

    Possible<Boolean> invitable();

    @JsonProperty("rate_limit_per_user")
    Possible<Integer> rateLimitPerUser();

    Possible<Integer> flags();

    @JsonProperty("applied_tags")
    Possible<List<Id>> appliedTags();
}
