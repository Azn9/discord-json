package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.MemberData;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildMembersChunk.class)
@JsonDeserialize(as = ImmutableGuildMembersChunk.class)
public interface GuildMembersChunk extends Dispatch {

    @JsonProperty("guild_id")
    String guildId();
    List<MemberData> members();
    @JsonProperty("not_found")
    default Possible<List<String>> notFound() { return Possible.absent(); }
    default Possible<PresenceUpdate> presences() { return Possible.absent(); }

}