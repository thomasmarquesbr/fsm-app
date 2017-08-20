package br.com.lapic.thomas.fsm_app.injection.component;

import android.content.Context;

import br.com.lapic.thomas.fsm_app.injection.ActivityContext;
import br.com.lapic.thomas.fsm_app.injection.PerActivity;
import br.com.lapic.thomas.fsm_app.injection.module.ActivityModule;
import br.com.lapic.thomas.fsm_app.ui.mode.ModeActivity;
import br.com.lapic.thomas.fsm_app.ui.primarymode.PrimaryModeActivity;
import br.com.lapic.thomas.fsm_app.ui.secondarymode.SecondaryModeActivity;
import br.com.lapic.thomas.fsm_app.ui.splashscreen.SplashScreenActivity;
import dagger.Component;

/**
 * Created by Thomas on 02/08/2017.
 **/
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(SplashScreenActivity splashScreenActivity);

    void inject(ModeActivity modeActivity);

    void inject(PrimaryModeActivity primaryModeActivity);

    void inject(SecondaryModeActivity secondaryModeActivity);

    @ActivityContext
    Context context();

}
