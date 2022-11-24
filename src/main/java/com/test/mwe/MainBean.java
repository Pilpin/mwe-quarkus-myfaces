package com.test.mwe;

import org.omnifaces.util.Faces;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ApplicationScoped
public class MainBean implements Serializable {
    public String getProjectStage() {
        return Faces.getApplication().getProjectStage().toString();
    }

    public String getUseLambaMetafactory() {
        return Faces.getInitParameter("org.apache.myfaces.USE_LAMBDA_METAFACTORY");
    }
}