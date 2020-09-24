/*
 * Outcarcerate
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Client
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-09-24T20:34:04.774Z")
public class Client   {
  @JsonProperty("_id")
  private String _id = null;

  @JsonProperty("_rev")
  private String _rev = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  /**
   * Gets or Sets race
   */
  public enum RaceEnum {
    WHITE("White"),
    
    BLACK("Black"),
    
    HISPANIC("Hispanic"),
    
    OTHER("Other"),
    
    ASIAN("Asian"),
    
    AMERICAN_INDIAN("American Indian"),
    
    BIRACIAL("Biracial"),
    
    WHITE_HISPANIC_OR_LATINO_("White [Hispanic or Latino]"),
    
    WHITE_BLACK_HISPANIC_OR_LATINO_("White/Black [Hispanic or Latino]"),
    
    UNKNOWN("Unknown");

    private String value;

    RaceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RaceEnum fromValue(String text) {
      for (RaceEnum b : RaceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("race")
  private RaceEnum race = null;

  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    FEMALE("Female"),
    
    MALE("Male"),
    
    OTHER("Other"),
    
    UNKNOWN("Unknown");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(String text) {
      for (GenderEnum b : GenderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("gender")
  private GenderEnum gender = null;

  @JsonProperty("prior_felony_convictions")
  private Long priorFelonyConvictions = null;

  @JsonProperty("prior_misdemeanor_convictions")
  private Long priorMisdemeanorConvictions = null;

  /**
   * Gets or Sets criminalHistoryCategory
   */
  public enum CriminalHistoryCategoryEnum {
    I("Category I"),
    
    II("Category II"),
    
    III("Category III"),
    
    IV("Category IV"),
    
    V("Category V"),
    
    VI("Category VI");

    private String value;

    CriminalHistoryCategoryEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CriminalHistoryCategoryEnum fromValue(String text) {
      for (CriminalHistoryCategoryEnum b : CriminalHistoryCategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("criminal_history_category")
  private CriminalHistoryCategoryEnum criminalHistoryCategory = null;

  /**
   * Gets or Sets typeOfLegalRepresentation
   */
  public enum TypeOfLegalRepresentationEnum {
    SELF("Self"),
    
    COURT_APPOINTED_ATTORNEY("Court appointed attorney"),
    
    PRIVATE_ATTORNEY("Private attorney");

    private String value;

    TypeOfLegalRepresentationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeOfLegalRepresentationEnum fromValue(String text) {
      for (TypeOfLegalRepresentationEnum b : TypeOfLegalRepresentationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type_of_legal_representation")
  private TypeOfLegalRepresentationEnum typeOfLegalRepresentation = null;

  @JsonProperty("married")
  private Boolean married = null;

  @JsonProperty("annual_income_dollars")
  private Long annualIncomeDollars = null;

  /**
   * Gets or Sets educationLevelCompleted
   */
  public enum EducationLevelCompletedEnum {
    LESS_THAN_HIGH_SCHOOL_GRADUATE("Less than high school graduate"),
    
    HIGH_SCHOOL_GRADUATE_OR_EQUIVALENT("High school graduate or equivalent"),
    
    SOME_COLLEGE("Some college"),
    
    COLLEGE_GRADUATE_OR_MORE("College graduate or more"),
    
    UNKNOWN("Unknown");

    private String value;

    EducationLevelCompletedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EducationLevelCompletedEnum fromValue(String text) {
      for (EducationLevelCompletedEnum b : EducationLevelCompletedEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("education_level_completed")
  private EducationLevelCompletedEnum educationLevelCompleted = null;

  /**
   * Gets or Sets immigrationStatus
   */
  public enum ImmigrationStatusEnum {
    US_CITIZEN("US Citizen"),
    
    NON_US_CITIZEN("Non-US Citizen");

    private String value;

    ImmigrationStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ImmigrationStatusEnum fromValue(String text) {
      for (ImmigrationStatusEnum b : ImmigrationStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("immigration_status")
  private ImmigrationStatusEnum immigrationStatus = null;

  @JsonProperty("number_of_children_under_18_at_home")
  private String numberOfChildrenUnder18AtHome = null;

  public Client id(String id) {
    this._id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @JsonProperty("_id")
  @ApiModelProperty(value = "")
  public String getId() {
    return _id;
  }

  public void setId(String id) {
    this._id = id;
  }

  public Client rev(String rev) {
    this._rev = rev;
    return this;
  }

  /**
   * Get rev
   * @return rev
   **/
  @JsonProperty("_rev")
  @ApiModelProperty(value = "")
  public String getRev() {
    return _rev;
  }

  public void setRev(String rev) {
    this._rev = rev;
  }

  public Client firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   **/
  @JsonProperty("first_name")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Client lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   **/
  @JsonProperty("last_name")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Client race(RaceEnum race) {
    this.race = race;
    return this;
  }

  /**
   * Get race
   * @return race
   **/
  @JsonProperty("race")
  @ApiModelProperty(value = "")
  public RaceEnum getRace() {
    return race;
  }

  public void setRace(RaceEnum race) {
    this.race = race;
  }

  public Client gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   **/
  @JsonProperty("gender")
  @ApiModelProperty(value = "")
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public Client priorFelonyConvictions(Long priorFelonyConvictions) {
    this.priorFelonyConvictions = priorFelonyConvictions;
    return this;
  }

  /**
   * Get priorFelonyConvictions
   * @return priorFelonyConvictions
   **/
  @JsonProperty("prior_felony_convictions")
  @ApiModelProperty(value = "")
  public Long getPriorFelonyConvictions() {
    return priorFelonyConvictions;
  }

  public void setPriorFelonyConvictions(Long priorFelonyConvictions) {
    this.priorFelonyConvictions = priorFelonyConvictions;
  }

  public Client priorMisdemeanorConvictions(Long priorMisdemeanorConvictions) {
    this.priorMisdemeanorConvictions = priorMisdemeanorConvictions;
    return this;
  }

  /**
   * Get priorMisdemeanorConvictions
   * @return priorMisdemeanorConvictions
   **/
  @JsonProperty("prior_misdemeanor_convictions")
  @ApiModelProperty(value = "")
  public Long getPriorMisdemeanorConvictions() {
    return priorMisdemeanorConvictions;
  }

  public void setPriorMisdemeanorConvictions(Long priorMisdemeanorConvictions) {
    this.priorMisdemeanorConvictions = priorMisdemeanorConvictions;
  }

  public Client criminalHistoryCategory(CriminalHistoryCategoryEnum criminalHistoryCategory) {
    this.criminalHistoryCategory = criminalHistoryCategory;
    return this;
  }

  /**
   * Get criminalHistoryCategory
   * @return criminalHistoryCategory
   **/
  @JsonProperty("criminal_history_category")
  @ApiModelProperty(value = "")
  public CriminalHistoryCategoryEnum getCriminalHistoryCategory() {
    return criminalHistoryCategory;
  }

  public void setCriminalHistoryCategory(CriminalHistoryCategoryEnum criminalHistoryCategory) {
    this.criminalHistoryCategory = criminalHistoryCategory;
  }

  public Client typeOfLegalRepresentation(TypeOfLegalRepresentationEnum typeOfLegalRepresentation) {
    this.typeOfLegalRepresentation = typeOfLegalRepresentation;
    return this;
  }

  /**
   * Get typeOfLegalRepresentation
   * @return typeOfLegalRepresentation
   **/
  @JsonProperty("type_of_legal_representation")
  @ApiModelProperty(value = "")
  public TypeOfLegalRepresentationEnum getTypeOfLegalRepresentation() {
    return typeOfLegalRepresentation;
  }

  public void setTypeOfLegalRepresentation(TypeOfLegalRepresentationEnum typeOfLegalRepresentation) {
    this.typeOfLegalRepresentation = typeOfLegalRepresentation;
  }

  public Client married(Boolean married) {
    this.married = married;
    return this;
  }

  /**
   * Get married
   * @return married
   **/
  @JsonProperty("married")
  @ApiModelProperty(value = "")
  public Boolean isMarried() {
    return married;
  }

  public void setMarried(Boolean married) {
    this.married = married;
  }

  public Client annualIncomeDollars(Long annualIncomeDollars) {
    this.annualIncomeDollars = annualIncomeDollars;
    return this;
  }

  /**
   * Get annualIncomeDollars
   * @return annualIncomeDollars
   **/
  @JsonProperty("annual_income_dollars")
  @ApiModelProperty(value = "")
  public Long getAnnualIncomeDollars() {
    return annualIncomeDollars;
  }

  public void setAnnualIncomeDollars(Long annualIncomeDollars) {
    this.annualIncomeDollars = annualIncomeDollars;
  }

  public Client educationLevelCompleted(EducationLevelCompletedEnum educationLevelCompleted) {
    this.educationLevelCompleted = educationLevelCompleted;
    return this;
  }

  /**
   * Get educationLevelCompleted
   * @return educationLevelCompleted
   **/
  @JsonProperty("education_level_completed")
  @ApiModelProperty(value = "")
  public EducationLevelCompletedEnum getEducationLevelCompleted() {
    return educationLevelCompleted;
  }

  public void setEducationLevelCompleted(EducationLevelCompletedEnum educationLevelCompleted) {
    this.educationLevelCompleted = educationLevelCompleted;
  }

  public Client immigrationStatus(ImmigrationStatusEnum immigrationStatus) {
    this.immigrationStatus = immigrationStatus;
    return this;
  }

  /**
   * Get immigrationStatus
   * @return immigrationStatus
   **/
  @JsonProperty("immigration_status")
  @ApiModelProperty(value = "")
  public ImmigrationStatusEnum getImmigrationStatus() {
    return immigrationStatus;
  }

  public void setImmigrationStatus(ImmigrationStatusEnum immigrationStatus) {
    this.immigrationStatus = immigrationStatus;
  }

  public Client numberOfChildrenUnder18AtHome(String numberOfChildrenUnder18AtHome) {
    this.numberOfChildrenUnder18AtHome = numberOfChildrenUnder18AtHome;
    return this;
  }

  /**
   * Get numberOfChildrenUnder18AtHome
   * @return numberOfChildrenUnder18AtHome
   **/
  @JsonProperty("number_of_children_under_18_at_home")
  @ApiModelProperty(value = "")
  public String getNumberOfChildrenUnder18AtHome() {
    return numberOfChildrenUnder18AtHome;
  }

  public void setNumberOfChildrenUnder18AtHome(String numberOfChildrenUnder18AtHome) {
    this.numberOfChildrenUnder18AtHome = numberOfChildrenUnder18AtHome;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Client client = (Client) o;
    return Objects.equals(this._id, client._id) &&
        Objects.equals(this._rev, client._rev) &&
        Objects.equals(this.firstName, client.firstName) &&
        Objects.equals(this.lastName, client.lastName) &&
        Objects.equals(this.race, client.race) &&
        Objects.equals(this.gender, client.gender) &&
        Objects.equals(this.priorFelonyConvictions, client.priorFelonyConvictions) &&
        Objects.equals(this.priorMisdemeanorConvictions, client.priorMisdemeanorConvictions) &&
        Objects.equals(this.criminalHistoryCategory, client.criminalHistoryCategory) &&
        Objects.equals(this.typeOfLegalRepresentation, client.typeOfLegalRepresentation) &&
        Objects.equals(this.married, client.married) &&
        Objects.equals(this.annualIncomeDollars, client.annualIncomeDollars) &&
        Objects.equals(this.educationLevelCompleted, client.educationLevelCompleted) &&
        Objects.equals(this.immigrationStatus, client.immigrationStatus) &&
        Objects.equals(this.numberOfChildrenUnder18AtHome, client.numberOfChildrenUnder18AtHome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_id, _rev, firstName, lastName, race, gender, priorFelonyConvictions, priorMisdemeanorConvictions, criminalHistoryCategory, typeOfLegalRepresentation, married, annualIncomeDollars, educationLevelCompleted, immigrationStatus, numberOfChildrenUnder18AtHome);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    
    sb.append("    _id: ").append(toIndentedString(_id)).append("\n");
    sb.append("    _rev: ").append(toIndentedString(_rev)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    race: ").append(toIndentedString(race)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    priorFelonyConvictions: ").append(toIndentedString(priorFelonyConvictions)).append("\n");
    sb.append("    priorMisdemeanorConvictions: ").append(toIndentedString(priorMisdemeanorConvictions)).append("\n");
    sb.append("    criminalHistoryCategory: ").append(toIndentedString(criminalHistoryCategory)).append("\n");
    sb.append("    typeOfLegalRepresentation: ").append(toIndentedString(typeOfLegalRepresentation)).append("\n");
    sb.append("    married: ").append(toIndentedString(married)).append("\n");
    sb.append("    annualIncomeDollars: ").append(toIndentedString(annualIncomeDollars)).append("\n");
    sb.append("    educationLevelCompleted: ").append(toIndentedString(educationLevelCompleted)).append("\n");
    sb.append("    immigrationStatus: ").append(toIndentedString(immigrationStatus)).append("\n");
    sb.append("    numberOfChildrenUnder18AtHome: ").append(toIndentedString(numberOfChildrenUnder18AtHome)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

