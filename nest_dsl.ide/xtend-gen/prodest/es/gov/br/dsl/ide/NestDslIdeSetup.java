/**
 * generated by Xtext 2.18.0.M3
 */
package prodest.es.gov.br.dsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import prodest.es.gov.br.dsl.NestDslRuntimeModule;
import prodest.es.gov.br.dsl.NestDslStandaloneSetup;
import prodest.es.gov.br.dsl.ide.NestDslIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class NestDslIdeSetup extends NestDslStandaloneSetup {
  @Override
  public Injector createInjector() {
    NestDslRuntimeModule _nestDslRuntimeModule = new NestDslRuntimeModule();
    NestDslIdeModule _nestDslIdeModule = new NestDslIdeModule();
    return Guice.createInjector(Modules2.mixin(_nestDslRuntimeModule, _nestDslIdeModule));
  }
}