// Sameera Bammidi
// This class validates if the semester start date is greater than or equal to the date of survey.

import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("dateRangeValidator")
public class DateRangeValidator implements Validator
{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException
    {
        if (value == null)
        {
            return; // Let required="true" handle.
        }

        UIInput dateOfSurveyComponent = (UIInput) component.getAttributes().get("dateOfSurveyComponent");

        if (!dateOfSurveyComponent.isValid())
        {
            return; // Already invalidated. Don't care about it then.
        }

        Date startDate = (Date) dateOfSurveyComponent.getValue();

        if (startDate == null)
        {
            return; // Let required="true" handle.
        }

        Date semesterStartDate = (Date) value;

        if (startDate.after(semesterStartDate))
        {
        	dateOfSurveyComponent.setValid(false);
            throw new ValidatorException(new FacesMessage(
                FacesMessage.SEVERITY_ERROR, "Semester start date may not be less than the survey date.", null));
        }
    }

}
