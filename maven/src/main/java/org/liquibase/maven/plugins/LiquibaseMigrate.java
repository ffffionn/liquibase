package org.liquibase.maven.plugins;

import liquibase.exception.LiquibaseException;
import liquibase.migrator.Migrator;

/**
 * Liquibase Migration Maven plugin. This plugin allows for DatabaseChangeLogs to be
 * applied to a database as part of a Maven build process.
 * @author Peter Murray
 * @description Liquibase Migrate Maven plugin
 * @goal migrate
 */
public class LiquibaseMigrate extends ConfigurableLiquibaseMojo {

  protected void performLiquibaseTask(Migrator migrator) throws LiquibaseException {
    super.performLiquibaseTask(migrator);
    migrator.migrate();
  }
}
