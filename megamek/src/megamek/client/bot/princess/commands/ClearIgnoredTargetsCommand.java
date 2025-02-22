package megamek.client.bot.princess.commands;

import megamek.client.bot.princess.Princess;
import megamek.server.commands.arguments.Argument;
import megamek.server.commands.arguments.Arguments;

import java.util.List;

public class ClearIgnoredTargetsCommand implements ChatCommand {
    @Override
    public void execute(Princess princess, Arguments arguments) {
        princess.getBehaviorSettings().clearIgnoredUnitTargets();
        princess.sendChat("Cleared ignored targets list.");
    }
}
