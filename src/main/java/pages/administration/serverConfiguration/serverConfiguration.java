package pages.administration.serverConfiguration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


/**
 * Created by sarja on 7/23/2017.
 */
public class serverConfiguration {

//----------------Declare web elements starts here------
//abir
    //Declaration of WebDriver
    WebDriver driver;

    //Find Update button by xpath
    @FindBy(xpath = "//input[@value='Update']")
    WebElement updateButton;

    //Find Cancel button by Link text
    @FindBy(linkText = "Cancel")
    WebElement cancelButton;


    // -------Server Configuration web element starts-------//
    //Find "Administration" element by css
    @FindBy(css = "#adminSidemenu > a")
    WebElement administration;

    //Find "Administration" element by css
    @FindBy(xpath = "//li[@id='serverConfigLink']/a/span[2]")
    WebElement serverconfigurationsidemenu;

    //Find "Server Configuration" element by css
    @FindBy(css ="div.nlv-settings-row-title")
    WebElement serverConfiguration;

    //Find "Company name" tag input field by name
    @FindBy(name = "companyName")
    WebElement companyName;

    //Find "System name" tag input field by name
    @FindBy(name = "systemName")
    WebElement systemName;

    //Find "Administrator Email" tag input field by name
    @FindBy(name = "administratorEmail")
    WebElement administratorEmail;

    //Find "Time Zone" tag dropdown select field by name
    @FindBy(name = "timezone")
    WebElement timeZoneDropdownSelect;

    //Find "Locale language" tag input field by name
    @FindBy(name = "localeLanguage")
    WebElement localeLanguage;

    //Find "Locale country" tag input field by name
    @FindBy(name = "localeCountry")
    WebElement localeCountry;

// -------Server Configuration web element ends-------//

    // -------Email and Notification Settings web element starts-------//


    //Find "Email and Notification Settings" element by css
    @FindBy(css ="#sec1 > div.nlv-settings-row-title")
    WebElement emailandNotificationSettings;

    //Find "Notification mail server" tag input field by name
    @FindBy(name = "mailServer")
    WebElement notificationMailServer;

    //Find "Notification mail server username" tag input field by name
    @FindBy(name = "mailServerUsername")
    WebElement notificationMailServerUsername;

    //Find "Notification mail server password set" tag field by css
    @FindBy(css = "button.btn.btn-default")
    WebElement notificationMailServerPasswordSet;

    //Find "Notification mail server password clear" tag field by css
    @FindBy(css = "#btnMailServerPasswordClear")
    WebElement notificationMailServerPasswordClear;

    //Find "Notification mail server password " tag input field by css
    @FindBy(css = "#password")
    WebElement notificationMailServerPassword;

    //Find "Notification mail server password confirm" tag input field by css
    @FindBy(css = "#confirmPassword")
    WebElement notificationMailServerPasswordConfirm;

    //Find "Notification mail server password submit" button by xpath
    @FindBy(xpath = "//div[@id='modalSetPassword']/div/div/div[3]/button")
    WebElement notificationMailServerPasswordSubmit;


    //Find "Notification mail server password cancel" button by xpath
    @FindBy(xpath = "//div[@id='modalSetPassword']/div/div/div[3]/button[2]")
    WebElement notificationMailServerPasswordCancel;

    //Find "Notification mail server password close" button by css
    @FindBy(css = "button.close")
    WebElement notificationMailServerPasswordClose;

    //Find "Notification mail server port" tag input field by name
    @FindBy(name = "mailServerPortNo")
    WebElement notificationMailServerPortNo;

    //Find "Encrypted connection" tag select field by name
    @FindBy(name = "encryptedConnection")
    WebElement encryptedConnection;

    //Find "Notification Sender" tag input field by name
    @FindBy(name = "notificationSender")
    WebElement notificationSender;

    //Find "Notification link protocol HTTP " tag radio button by name
    @FindBy(name = "notificationLinkProtocol")
    WebElement notificationLinkProtocolHTTP;

    //Find "Notification link protocol HTTPS " tag radio button by xpath
    @FindBy(xpath = "(//input[@name='notificationLinkProtocol'])[2]")
    WebElement notificationLinkProtocolHTTPS;

    //Find "Only allow HTTPS" tag check box button by name
    @FindBy(name = "onlyAllowHttps")
    WebElement onlyAllowHTTPS;

    //Find "Notify user yes when password reset by an administrator" tag radio button by name
    @FindBy(name = "notifyUserOnAdminPasswordReset")
    WebElement notifyUserOnAdminPasswordResetYes;

    //Find "Notify user no when password reset by an administrator" tag radio button by xpath
    @FindBy(xpath = "(//input[@name='notifyUserOnAdminPasswordReset'])[2]")
    WebElement notifyUserOnAdminPasswordResetNo;

    //Find "Notify user yes when password reset by an user" tag radio button by name
    @FindBy(name = "notifyUserOnUserPasswordReset")
    WebElement notifyUserOnUserPasswordResetYes;

    //Find "Notify user no when password reset by an user" tag radio button by xpath
    @FindBy(xpath = "//div[@id='sec1']/div[3]/div[11]/div/label[2]/input")
    WebElement notifyUserOnUserPasswordResetNo;

    //Find "System notification sender" tag input field by name
    @FindBy(name = "systemNotificationSender")
    WebElement systemNotificationSender;

    //Find "Populate username for delivery notification links" tag yes radio button by name
    @FindBy(name = "apDeliveryLink")
    WebElement apDeliveryLinkYes;

    //Find "Populate username for delivery notification links" tag no radio button by xpath
    @FindBy(xpath = "//div[@id='sec1']/div[3]/div[13]/div/label[2]/input")
    WebElement apDeliveryLinkNo;

    //Find "Enable email HTML mode" tag yes radio button by name
    @FindBy(name = "emailEnableHtmlMode")
    WebElement emailEnableHtmlModeYes;

    //Find "Enable email HTML mode" tag yes radio button by xpath
    @FindBy(xpath = "//div[@id='sec1']/div[3]/div[14]/div/label[2]/input")
    WebElement emailEnableHtmlModeNo;


    // -------Email and Notification Settings web element ends-------//


    // -------Delivery Settings web element starts-------//

    //Find "Delivery Settings" element by css
    @FindBy(css ="#sec2 > div.nlv-settings-row-title")
    WebElement deliverySettings;

    //Find "default secure message" element by class
    @FindBy(className = "cke_wysiwyg_frame")
    WebElement defaultSecureMessage;

    //Find "default secure message body" element by tag
    @FindBy(tagName = "body")
    WebElement defaultSecureMessageBody;








    //





    //
    //
    //



    //Find "List files in delivery notification message " tag check box by name
    @FindBy(name = "listDeliveredFilesOnDeliveryNotification")
    WebElement listDeliveredFilesOnDeliveryNotification;

    //Find "Delivery expires after (in days)" tag input field by name
    @FindBy(name = "deliveryExpirationDays")
    WebElement deliveryExpirationDays;

    //Find "Apply to all users " tag check box by name
    @FindBy(name = "applyDeliveryExpirationDaysToAllUsers")
    WebElement applyDeliveryExpirationDaysToAllUsers;

    //Find "Delivery Options : Show date available by default "  check box by name
    @FindBy(name = "showDateAvailable")
    WebElement showDateAvailable;

    //Find "Delivery Options : Show password by default  "  check box by name
    @FindBy(name = "showPassword")
    WebElement showPasswordDefault;

    //Find "Express Delivery Options: Show secure message by default "  check box by name
    @FindBy(name = "expDeliverySimpleModeShowSecureMsg")
    WebElement expDeliverySimpleModeShowSecureMsg;

    //Find "Express Delivery Options: Show notification message by default  "  check box by name
    @FindBy(name = "expDeliverySimpleModeShowNotificationMsg")
    WebElement expDeliverySimpleModeShowNotificationMsg;

    //Find "Always require recipients to sign in  " tag  yes radio button by name
    @FindBy(name = "deliveryAlwaysRequireSignIn")
    WebElement deliveryAlwaysRequireSignInYes;

    //Find "Always require recipients to sign in  " tag  no radio button by xpath
    @FindBy(xpath = "(//input[@name='deliveryAlwaysRequireSignIn'])[2]")
    WebElement deliveryAlwaysRequireSignInNo;

    //Find "Require recipients to sign in by default" tag  yes radio button by name
    @FindBy(name = "recipientsSignInDefault")
    WebElement recipientsSignInDefaultYes;

    //Find "Require recipients to sign in by default" tag  no radio button by xpath
    @FindBy(xpath = "(//input[@name='recipientsSignInDefault'])[2]")
    WebElement recipientsSignInDefaultNo;

    //Find "Enable reply" tag  yes radio button by name
    @FindBy(name = "enableSecureReply")
    WebElement enableSecureReplyYes;

    //Find "Enable reply" tag  no radio button by xpath
    @FindBy(xpath = "(//input[@name='enableSecureReply'])[2]")
    WebElement enableSecureReplyNo;

    //Find " Enable reply to all" tag  yes radio button by name
    @FindBy(name = "enableCollaboration")
    WebElement enableReplyAllYes;

    //Find "Enable reply to all" tag  no radio button by xpath
    @FindBy(xpath = "(//input[@name='enableCollaboration'])[2]")
    WebElement enableReplyAllNo;

    //Find "Show reply section by default "  check box by name
    @FindBy(name = "showSecureReplySectionByDefault")
    WebElement showSecureReplySectionByDefault;

    //Find "Delimiter character for auto-complete"  dropdown field by name
    @FindBy(name = "delimiterCharacter")
    WebElement delimiterCharacter;

    //Find "Configure paypal settings "  link by name
    @FindBy(name = "adminPaypalConfig")
    WebElement adminPaypalConfig;

    //Find "Configure limited sender settings "  link by name
    @FindBy(name = "adminLimitedSenderConfig")
    WebElement adminLimitedSenderConfig;

    // -------Configure paypal settings web element starts-------//


    //Find " Enable PayPal" tag  yes radio button by name
    @FindBy(name = "enablePaypal")
    WebElement enablePaypalYes;



    //Find "Enable PayPal" tag  no radio button by xpath
    @FindBy(xpath = "(//input[@name='enablePaypal'])[2]")
    WebElement enablePaypalNo;

    //Find "PayPal payment account" tag input field by name
    @FindBy(name = "paypalPaymentAccount")
    WebElement paypalPaymentAccount;

    //Find "PayPal API username" tag input field by name
    @FindBy(name = "paypalApiUsername")
    WebElement paypalApiUsername;

    //Find " set" tag button by name
    @FindBy(name = "enableCollaboration")
    WebElement paypalApiPasswordSet;

    //Find " clear" tag button by name
    @FindBy(name = "paypalApiPassword_clear")
    WebElement paypalApiPasswordClear;

    //Find "Paypal API password " tag input field by css
    @FindBy(css = "#password")
    WebElement paypalAPIPassword;


    //Find "Paypal API password confirm" tag input field by css
    @FindBy(css = "#confirmPassword")
    WebElement paypalAPIPasswordConfirm;

    //Find "Paypal API password submit" button by xpath
    @FindBy(xpath = "(//button[@type='button'])[4]")
    WebElement paypalAPIPasswordSubmit;

    //Find "Paypal API password cancel" button by xpath
    @FindBy(xpath = "(//button[@type='button'])[5]")
    WebElement paypalAPIPasswordCancel;

    //Find "Paypal API password close" button by css
    @FindBy(css = "button.close")
    WebElement paypalAPIPasswordClose;

    //Find "PayPal signature" tag input field by name
    @FindBy(name = "paypalApiSignature")
    WebElement paypalApiSignature;

    //Find "List of users who can charge for delivery" tag input field by name
    @FindBy(name = "paypalUsersList")
    WebElement paypalUsersList;

    //Find "Payment privacy policy URL" tag input field by name
    @FindBy(name = "paymentPrivacyPolicyUrl")
    WebElement paymentPrivacyPolicyUrl;

    //Find "Payment refund policy URL" tag input field by name
    @FindBy(name = "paymentRefundPolicyUrl")
    WebElement paymentRefundPolicyUrl;

    //Find "Verify PayPal configuration settings "  link by xpath
    @FindBy(xpath = "//a[contains(text(),'Verify PayPal configuration settings')]")
    WebElement verifyPaypalConfigurationSettings;

    //Find "Verify PayPal account settings First name" tag input field by name
    @FindBy(name = "fName")
    WebElement paypalAccountFirstName;

    //Find "Verify PayPal account settings Last name" tag input field by name
    @FindBy(name = "lName")
    WebElement paypalAccountLastName;

    //Find "Verify PayPal " tag button by name
    @FindBy(name = "verifyPaypal")
    WebElement paypalAccountVerify;


    //Find "Verify PayPal account settings close" button by css
    @FindBy(css = "button.bootbox-close-button.close")
    WebElement paypalAccountClose;

    //Find "Update " tag button by css
    @FindBy(css = "input.btn.btn-primary")
    WebElement paypalAccountUpdate;



    //Find "Cancel " tag button by css
    @FindBy(css = "input.btn.btn-default")
    WebElement paypalAccountCancel;

    // -------Configure paypal settings web element ends-------//


    // -------Configure limited sender settings web element starts-------//


    //Find " Enable limited senders" tag  yes radio button by name
    @FindBy(name = "enableLimitedSender")
    WebElement enableLimitedSenderYes;

    //Find "Enable limited senders" tag  no radio button by xpath
    @FindBy(xpath = "(//input[@name='enableLimitedSender'])[2]")
    WebElement enableLimitedSenderNo;

    //Find " Require sender to sign in " tag  check box by name
    @FindBy(name = "requireSenderSignIn")
    WebElement requireSenderSignIn;

    //Find " Allow user to type in " tag  radio button by name
    @FindBy(name = "allowInputRecipientAddress")
    WebElement allowInputRecipientAddress;

    //Find "Restrict recipients to" tag input field by name
    @FindBy(name = "recipientRestrictionList")
    WebElement recipientRestrictionList;

    //Find "  Use default value " tag  radio button by name
    @FindBy(name = "allowDefaultRecipient")
    WebElement allowDefaultRecipient;

    //Find "Use default value " tag input field by name
    @FindBy(name = "defaultRecipient")
    WebElement defaultRecipient;

    //Find "  Use default value Visible " tag  check box by name
    @FindBy(name = "isDefaultRecipientVisible")
    WebElement defaultRecipientVisible;

    //Find "  List users with Email: *@  " tag  radio button by name
    @FindBy(name = "allowListUsersWithEmail")
    WebElement allowListUsersWithEmail;



    //Find "List users with Email: *@" tag input field by name
    @FindBy(name = "usersWithEmail")
    WebElement usersWithEmail;


    //Find "  Show subject field" tag  check box by name
    @FindBy(name = "showSubjectField")
    WebElement showSubjectField;



    //Find "  Show message field " tag  check box by name
    @FindBy(name = "showMessageField")
    WebElement showMessageField;

    //Find "  Maximum number of file uploads  " tag select field by name
    @FindBy(name = "maxFileUploads")
    WebElement maxFileUploads;

    //Find "Maximum size per file (KB)" tag input field by name
    @FindBy(name = "maxSizePerFile")
    WebElement maxSizePerFile;

    //Find "  Send email notification to recipients " tag  check box by name
    @FindBy(name = "sendNotification")
    WebElement sendNotificationRecipients;

    //Find "  Require recipients to sign in  " tag  check box by name
    @FindBy(name = "requireRecipientSignIn")
    WebElement requireRecipientSignIn;

    //Find "Automatically delete after (in days) " tag input field by name
    @FindBy(name = "autoDeletionDays")
    WebElement autoDeletionDays;

    //Find "  Limited Sender Settings Update " tag  button by css
    @FindBy(css = "input.btn.btn-primary")
    WebElement limitedSenderUpdate;

    //Find "  Limited Sender Settings Cancel " tag  button by css
    @FindBy(css = "input.btn.btn-default")
    WebElement limitedSenderCancel;




    // -------Configure limited sender settings web element ends-------//





    // -------Delivery Settings web element ends-------//





    // -------Package Settings web element starts-------//

    //Find "Package Settings" element by css
    @FindBy(css ="#sec3 > div.nlv-settings-row-title")
    WebElement packageSettings;

    //Find "Radio button yes To Notify user When added as a package owner or sender" by name
    @FindBy(name ="packageNotifyNewOwners")
    WebElement enableRadioButtonYesToNotifyUser;

    //Find "Radio button no To Notify user When added as a package owner or sender" by xpath
    @FindBy(xpath ="(//input[@name='packageNotifyNewOwners'])[2]")
    WebElement enableRadioButtonNoToNotifyUser;

    //Find "Radio button yes To Allow users to delete multiple packages" by name
    @FindBy(name ="packageAllowMultipleDeleted")
    WebElement enableRadioButtonYesToAllowMultipleDelete;

    //Find "Radio button no To Allow users to delete multiple packages" by xpath
    @FindBy(xpath ="(//input[@name='packageAllowMultipleDeleted'])[2]")
    WebElement enableRadioButtonNoToAllowMultipleDelete;

    //Find "Package deletes after (in days)" tag input field by name
    @FindBy(name ="autoPackageDeletionDays")
    WebElement autoPackageDeletionAfterDays;

    //Find "Package deletes after (in days) Apply to existing packages" checkbox by name
    @FindBy(name ="applyToExistingPackages")
    WebElement applyToExistingPackagesCheckBox;

    //Find "Alert for deletion" input field by name
    @FindBy(name ="autoPackageDelReminderDays")
    WebElement alertForDeletion;

    //Find "Second alert for deletion" input field by name
    @FindBy(name ="autoPackageDel2ndReminderDays")
    WebElement secondAlertForDeletion;

    //Find "Hide auto-deletion fields if not editable" radio button yes field by name
    @FindBy(name ="hideAutoPackageDeletion")
    WebElement hideAutoDeletionYesRadioButton;

    //Find "Hide auto-deletion fields if not editable" radio button no field by xpath
    @FindBy(xpath ="(//input[@name='hideAutoPackageDeletion'])[2]")
    WebElement hideAutoDeletionRadioButtonNo;

    //Find "List of owners who can override package deletion" input field by name
    @FindBy(name ="autoPackageDelOverrideList")
    WebElement autoPackageDeleteOverride;

    //Find "Unrestricted senders" input field by name
    @FindBy(name ="unrestrictedSendersList")
    WebElement unRestrictedSenders;

    //Find "Default recipient inclusion list" input field by name
    @FindBy(name ="recipientInclusionList")
    WebElement defaultRecipientInclusion;

    //Find "Default recipient exclusion list" input field by name
    @FindBy(name ="recipientExclusionList")
    WebElement defaultRecipientExclusionList;

    //Find "File type restrictions" input field by name
    @FindBy(name ="blockExtUploadingList")
    WebElement fileTypeRestrictions;

    //Find "Allow unrestricted senders to bypass file type restrictions" checkbox by name
    @FindBy(name ="unrestrictedSendersFileTypeBypass")
    WebElement unRestrcitedSenderBypassFileTypeRestriction;

    //Find "Enable java applet for upload" yes radio button by name
    @FindBy(name ="allowAppletUsage")
    WebElement enableAppletRadioButtonYes;

    //Find "Enable java applet for upload" no radio button by xpath
    @FindBy(xpath ="(//input[@name='allowAppletUsage'])[2]")
    WebElement enableAppletRadioButtonNo;

    //Find "Preferred upload method" java applet radio button by name
    @FindBy(name ="uploadMethod")
    WebElement preferredUploadMethodApplet;

    //Find "Preferred upload method" HTML radio button by xpath
    @FindBy(xpath ="(//input[@name='uploadMethod'])[2]")
    WebElement preferredUploadMethodHtml;

    //Find "Preferred upload method apply to all users" checkbox by name
    @FindBy(name ="applyUploadMethodToAll")
    WebElement preferredUploadMethodApplytoAll;

    //Find "Enable java applet for download" yes radio button by name
    @FindBy(name ="allowAppletUsageForDownload")
    WebElement downloadAppletUsage;

    //Find "Enable java applet for download" no radio button by xpath
    @FindBy(xpath ="(//input[@name='allowAppletUsageForDownload'])[2]")
    WebElement downloadNoAppletUsage;
    WebElement downloadNoAppletUsages;

    //Find "Enable java applet apply to all users" checkbox by name
    @FindBy(name ="applyDownloadMethodToAll")
    WebElement preferredDownloadMethodApplytoAll;

    //Find "Default value for overwrite files checkbox" overwrite radio button by name
    @FindBy(name ="defaultOverwriteFiles")
    WebElement defaultOverWriteFilesYes;
    //test sarja

    //Find "Default value for overwrite files checkbox" do not overwrite radio button by xpath
    @FindBy(xpath ="(//input[@name='defaultOverwriteFiles'])[2]")
    WebElement defaultOverWriteFilesNo;

    //Find "File upload and download with applet allowed for" input field by name
    @FindBy(name ="appletUserList")
    WebElement appletAllowedUserList;


    // -------Package Settings web element ends-------//


    //-------Workspace Settings webelement starts---------//

    //Find Workspace Settings by css
    @FindBy(css ="#sec4 > div.nlv-settings-row-title")
    WebElement workspace;

    //Enable worksapce by clicking radio button
    @FindBy(xpath="//input[@name='workspaceEnable']")
    WebElement enableWorkspace;

    //Sender license for collaborator
    @FindBy (name= "numOfAllowedSenderlicenses")
    WebElement senderLicenseCollaboration;

    //Collaborators for user
    @FindBy(name="collaboratorPerUser")
    WebElement collaboratorPerUser;

    //Worksapcce Delete after days
    @FindBy (name = "autoWorkspaceDeletionDays")
    WebElement autoDeleteDate;

    //Apply to all workspace
    @FindBy (name = "applyToExistingWorkspaces")
    WebElement applyAllWorkspace;

    //First alert for deletion
    @FindBy (name = "autoWorkspaceDelReminderDays")
    WebElement firstDeletionReminder;

    //Second alert for deletion
    @FindBy (name = "autoWorkspaceDel2ndReminderDays")
    WebElement secondDeletionReminder;

    //Hide auto deletion
    @FindBy (name = "hideAutoWorkspaceDeletion")
    WebElement hideAutoDeletion;

    //Default Notification settings
    @FindBy (id = "toggleSelect")
    WebElement checkAllNotification;

    //-------Workspace Settings webelement ends---------//

    //-----Antivirus Settings webelement starts--------//

    //enable antivirus
    @FindBy (name = "antivirusEnable")
    WebElement antivirusEnable;

    //disable antivirus
    @FindBy (xpath = "(//input[@name='antivirusEnable'])[2]")
    WebElement antivirusDisable;

    //file pattern
    @FindBy (name="antivirusTrustedFilePatternList")
    WebElement filePattern;

    //Enable maximum size of file to scan
    @FindBy (name="antivirusMaxFileSizeUsage")
    WebElement fileSizeEnable;

    //size of file
    @FindBy (name="antivirusMaxFileSize")
    WebElement maxFilesSize;

    //local server
    @FindBy (name="metascanRemoteServerUsage")
    WebElement localServer;

    //Remote server
    @FindBy (xpath = "(//input[@name='metascanRemoteServerUsage'])[2]")
    WebElement remoteServer;

    //Remote server location
    @FindBy (name="metascanRemoteServerUrl")
    WebElement remoteServerAddress;

    //RestApi version select
    @FindBy (name="metadefenderRestAPIVersion")
    WebElement restApiSelect;

    //-----Antivirus Settings webelement ends--------//


    //----User settings webelement start-------------//

    //enable compliance
    @FindBy (name="enableComplianceRole")
    WebElement enableCompliance;

    //disable compliance
    @FindBy (xpath="(//input[@name='enableComplianceRole'])[2]")
    WebElement disableCompliance;

    //enable quota
    @FindBy (name="enableUserQuota")
    WebElement enableQuota;

    //disable quota
    @FindBy (xpath ="(//input[@name='enableUserQuota'])[2]")
    WebElement disableQuota;

    //Quota per user
    @FindBy (name="userQuota")
    WebElement userQuota;

    //Maximum Quuota
    @FindBy (name="maximumUserQuota")
    WebElement maximumUserQuota;

    //Disable expiration
    @FindBy (xpath="(//input[@name='enableUserExpiration'])[2]")
    WebElement disableExpiration;

    //enable expiration
    @FindBy (name="enableUserExpiration")
    WebElement enableExpiration;

    //Inactivity period
    @FindBy (name="inactivityPeriod")
    WebElement inactivityPeriod;

    //Expire User
    @FindBy (id="removeSenderRoleOnlyNo")
    WebElement expireUser;

    //Remove sender license
    @FindBy (id="removeSenderRoleOnlyYes")
    WebElement removeSenderLicense;

    //First warning message
    @FindBy (name="daysBeforeFirstWarning")
    WebElement fristWarning;

    //Second Warning
    @FindBy (name="daysBeforeFinalWarning")
    WebElement secondWarning;

    //Exclusion List
    @FindBy (name="expirationExclusionList")
    WebElement exclusionList;

    //Delete expir user
    @FindBy (name="daysToDeleteExpiredUsers")
    WebElement deleteExpireUser;

    //----User settings webelement end-------------//


    // -------User interface web elements starts -------//

    //Find "User interface" element by css
    @FindBy(css = "#sec10 > div.nlv-settings-row-title")
    WebElement userInterface;

    //Find "Browser window title" tag input field by name
    @FindBy(name = "browserWindowTitle")
    WebElement browserWindowTitle;
    //Find "CSS stylesheet location" tag input field by name
    @FindBy(name = "css")
    WebElement cssStyleSheetLocation;
    //Find "Logo location" tag input field by name
    @FindBy(name = "logo")
    WebElement logoLocation;
    //Find "Logo links to (optional)" tag input field by name
    @FindBy(name = "logoLink")
    WebElement logoLink;
    //Find "Logo width (pixels)" tag input field by name
    @FindBy(name = "logoWidth" )
    WebElement logoWidth;
    //Find "Logo height (pixels)" tag input field by name
    @FindBy(name = "logoHeight")
    WebElement logoHeight;
    //Find "Custom sign in text (top)" tag input field by name
    @FindBy(name = "signInTextTop")
    WebElement signInTextTop;
    //Find "Reset to original value" for "Custom sign in text (top)" tag input field by name
    @FindBy(linkText = "Reset to original value")
    WebElement resetToOriginalValueLinkCustomSignInTextTop;
    //Find "Custom sign in text (right)" tag input field by name
    @FindBy(name = "signInTextRight")
    WebElement signInTextRight;
    //Find "Reset to original value" for "Custom sign in text (right)" tag input field by name
    @FindBy(xpath = "(//a[contains(text(),'Reset to original value')])[2]")
    WebElement resetToOriginalValueLinkCustomSignInTextRight;
    //Find "Custom web page footer" tag input field by name
    @FindBy(name = "customWebPageFooter")
    WebElement webPageFooter;
    //Find "Reset to original value" for "Custom web page footer" tag input field by name
    @FindBy(xpath = "(//a[contains(text(),'Reset to original value')])[3]")
    WebElement resetToOriginalValueLinkCustomWebPageFooter;
    //Find "Custom help URL" tag input field by name
    @FindBy(name = "customHelpUrl")
    WebElement customUrl;

    // -------User interface web elements ends-------//

    //Contact and Group Settings web element starts

    //Find "Contact and Group Settings" link by CSS
    @FindBy(css = "#sec7 > div.nlv-settings-row-title")
    WebElement contactAndGroupSettings;

    //Find "Manage Exchange Server connections" link
    @FindBy(linkText = "Manage Exchange Server connections")
    WebElement exchangeConnectionLink;
    //Find "Action" button by xpath
    @FindBy(xpath= "//button")
    WebElement actionButton;

    //Find "Create Exchange Server connection" link
    @FindBy(linkText = "Create Exchange Server connection")
    WebElement createExchangeLink;

    //Find Server name input field by name
    @FindBy(name= "serverName")
    WebElement serverName;
    //Find Domain name input field by name
    @FindBy(name= "domainName")
    WebElement domainName;
    //Find FDQN input field by name
    @FindBy(name="fqdn")
    WebElement fqdn;
    //Find user name input field by name
    @FindBy(name= "userName")
    WebElement userName;
    //Find password input field by name
    @FindBy(name= "password")
    WebElement password;
    //Find confirm password input field by name
    @FindBy(name="confirmPassword")
    WebElement confirmPassword;
    //Find connector host input field by name
    @FindBy(name="adConnectorHost")
    WebElement adConnectHost;
    //Find submit button by xpath
    @FindBy(xpath= "//button[@type='submit']")
    WebElement submitButton;
    //Find enable button by link
    @FindBy(linkText = "Enable")
    WebElement enableLink;
    //Find exchange server name by link
    @FindBy(linkText= "EXCH01")
    WebElement exchnageNameLink;
    //Find "Back to Manage Exchange Server Connections" link
    @FindBy(linkText = "Back to Manage Exchange Server Connections")
    WebElement backLink;
    //Find admin side menu by xpath
    @FindBy(xpath= "//li[@id='adminSidemenu']/a/span[2]")
    WebElement adminSideMenu;
    //Find Server Config section by xpath
    @FindBy(xpath= "//li[@id='serverConfigLink']/a/span[2]")
    WebElement serverConfiglink;

    //Contact and Group Settings web elements ends

    //Sign in and Password web elements starts

    //Find "Sign in and Password" link by CSS
    @FindBy(css="#sec8 > div.nlv-settings-row-title")
    WebElement signinAndPass;
    //Find min password length input box by name
    @FindBy(name= "logonAttemptsMax")
    WebElement logonAttemptsMax;
    //Find max password length input box by name
    @FindBy(name= "passwordLengthMin")
    WebElement passwordLengthMin;
    //Find Force upper case check box by name
    @FindBy(name= "forceUppercase")
    WebElement forceUppercaseCheckBox;
    //Find Force lower case check box by name
    @FindBy(name= "forceLowercase")
    WebElement forceLowercaseCheckBox;
    //Find Force digit check box by name
    @FindBy(name= "forceDigit")
    WebElement forceDigitCheckBox;
    //Find Force non Alpha numeric check box by name
    @FindBy(name= "forceNonAlpha")
    WebElement forceNonAlphaCheckBox;
    //Find Allow non alpha type radio button by css
    @FindBy(css= "div.col-xs-4 > label.radio-inline > input[name=\"allowNonAlphaType\"]")
    WebElement allowNonAlphaType;
    // Find allow non alpha list input box by name
    @FindBy(name= "allowedNonAlphaList")
    WebElement allowedNonAlphaList;

    //###External authentication source configuration (AD) starts

    //Find External authentication source radio button
    @FindBy(name= "externalAuthSource")
    WebElement externalAuthSource;
    //Find External authentication source link
    @FindBy(linkText= "External authentication source configuration")
    WebElement externalAuthLink;
     //Find External authentication source link
    @FindBy(linkText= "Create AD Authentication Source")
    WebElement authenticationLink;
    //Find source name input box by name
    @FindBy(name= "sourceName")
    WebElement sourceName;
    //Find realm input box by name
    @FindBy(name= "realm")
    WebElement realm;
    //Find username input box by name
    @FindBy(name= "systemUsername")
    WebElement systemUsername;
    //Find password input box by name
    @FindBy(name= "systemUserPassword")
    WebElement systemUserPassword;
    //Find Confirm password input box by name
    @FindBy(name= "confirmSystemUserPassword")
    WebElement confirmSystemUserPassword;
    //Find AD connector Host input box by name
    @FindBy(name= "adConnectorHost")
    WebElement adConnectorHost;
    //Find Sender role input box by name
    @FindBy(name= "sender")
    WebElement sender;
    //Find Recipient role input box by name
    @FindBy(name= "recepient")
    WebElement recipient;
    //Find Collaborator role input box by name
    @FindBy(name= "collaborator")
    WebElement collaborator;
    //Find Admin role input box by name
    @FindBy(name= "admin")
    WebElement superAdmin;
    //Find connector port input box by name
    @FindBy(name= "adConnectorPort")
    WebElement adConnectorPort;
    //Find external authentication link
    @FindBy(linkText="Manage External Authentication Sources")
    WebElement manageExternalAuthLink;
    //###External authentication source configuration (AD) ends

    //## OpenLDAP web element starts

    @FindBy(linkText= "Create LDAP Authentication Source")
    WebElement createOpenLDAPSource;

    @FindBy(name= "usernameAttribute")
    WebElement usernameAttribute;

    @FindBy(name= "groupMembershipAttribute")
    WebElement groupMembershipAttribute;

    @FindBy(name= "emailAddress")
    WebElement emailAddress;

    @FindBy(name= "firstName")
    WebElement firstName;
    @FindBy(name= "lastName")
    WebElement lastName;

    @FindBy(name= "displayAs")
    WebElement displayAs;

    @FindBy(name= "company")
    WebElement company;

    @FindBy(name= "baseDNs")
    WebElement baseDNs;

    @FindBy(name= "recepient")
    WebElement recepient;

    @FindBy(name= "limitedSender")
    WebElement limitedSender;

    @FindBy(name= "report")
    WebElement report;

    @FindBy(name= "compliance")
    WebElement compliance;

    @FindBy(name= "usrAdmin")
    WebElement userAdmin;

    @FindBy(name= "sysAdmin")
    WebElement sysAdmin;

    @FindBy(name= "admin")
    WebElement admin;

    @FindBy(name= "outlookAddIn")
    WebElement outlookAddIn;

    //##OpenLDAP webelement ends

    //##SunOne webelement starts


    //##SunOne webelement ends


    //Sign in and Password web elements ends



    //---------------Outlook add-in settings web elements starts------------------

    //Find "Microsoft outlook addin configuration settings" tab by css
    @FindBy(css = "#sec12 > div.nlv-settings-row-title")
    WebElement outlookAddinSettings;

    //Find "Configure Outlook add-in policies" by link text
    @FindBy(linkText = "Configure Outlook add-in policies")
    WebElement configureOutlookAddinPolicies;

    //Find radio button yes for enable outlook addin by name
    @FindBy(name = "outlookEnable")
    WebElement enableOutlookRadioButtonYes;

    //Find radio button no for enable outlook addin by xpath
    @FindBy(xpath = "(//input[@name='outlookEnable'])[2]")
    WebElement enableOutlookRadioButtonNo;

    //Find outlook addin settings update button by xpath
    @FindBy(xpath = "//button[@type='submit']")
    WebElement outlookAddinSettingsUpdate;

    //Find outlook addin settings cancel button by xpath
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    WebElement outlookAddinSettingsCancel;

    //Find outlook addin server address
    @FindBy(name = "serverEmail")
    WebElement outlookAddinServerEmailAddress;

    //Find outlook addin Policy synchronization interval
    @FindBy(name = "policySyncInterval")
    WebElement outlookPolicySyncInterval;

    //Find outlook addin Enable Secure Message button
    @FindBy(name = "enableSendSecurelyButton")
    WebElement outlookEnableSecureMessageCheckBox;

    //Find outlook addin Recipients exempt from policy
    @FindBy(name = "policyExemptUserList")
    WebElement outlookRecipientExemptFromPolicy;

    //Find outlook addin Key words
    @FindBy(name = "subjectKeyword")
    WebElement outlookSubjectKeyWord;

    //Find outlook addin Total attachment size
    @FindBy(name = "attachmentSize")
    WebElement outlookTotalAttachmentSize;

    //Find outlook addin Attachment name patterns
    @FindBy(name = "attachmentnamePatterns")
    WebElement outlookAttachmentPattern;

    //Find outlook addin Allow users to bypass policy radio button yes
    @FindBy(name = "bypassPolicy")
    WebElement outlookBypassPolicyRadioButtonYes;

    //Find outlook addin Allow users to bypass policy radio button no
    @FindBy(xpath = "(//input[@name='bypassPolicy'])[2]")
    WebElement outlookBypassPolicyRadioButtonNo;

    //Find outlook Retain attachments for sent emails
    @FindBy(name = "retainAttachments")
    WebElement outlookRetainAttachmentCheckBox;

    //Find outlook Maximum size for attachment
    @FindBy(name = "maxRetainAttachmentSize")
    WebElement outlookMaximumAttachmentSize;

    //Find outlook email body as securemessage
    @FindBy(name = "emailBodyAsSecureMessage")
    WebElement outlookEmailBodyAsSecuremessageRadioButton;

    //Find outlook email body as notification message
    @FindBy(xpath = "(//input[@name='emailBodyAsSecureMessage'])[2]")
    WebElement outlookEmailBodyAsNotificationmessageRadioButton;

    //Find outlook emailaddress to notify
    @FindBy(name = "notificationEmails")
    WebElement outlookNotificationEmailAddress;

    //Find outlook Include Secure Message in stub email
    @FindBy(name = "includeSecureMessageInStubEmail")
    WebElement outlookIncludeSecureMessageInStubMailCheckBox;



    //---------------Outlook add-in settings web elements ends--------------------

    //---------------Proxy Server Settings web elements starts--------------------

    //Find proxy server settings element by css
    @FindBy(css = "#sec14 > div.nlv-settings-row-title")
    WebElement proxyServerSettings;

    //Find from proxy server settings Use proxy server no radio button by xpath
    @FindBy(xpath = "(//input[@name='allowProxy'])[2]")
    WebElement noRadioButtonProxySettings;

    //Find from proxy server settings Use proxy server yes radio button by name
    @FindBy(name = "allowProxy")
    WebElement yesRadioButtonProxySettings;

    //Find proxy host input field by name
    @FindBy(name = "proxyHost")
    WebElement proxyHostProxySettings;

    //Find proxy port input field by name
    @FindBy(name = "proxyPort")
    WebElement proxyPortProxySettings;

    //Find Username input field by name
    @FindBy(name = "proxyUsername")
    WebElement proxyUsernameProxySettings;

    //Find Clear button by name
    @FindBy(name = "proxyPassword_clear")
    WebElement proxyPasswordClearProxySettings;

    //Find Set button by name
    @FindBy(name = "proxyPassword_update")
    WebElement proxyPasswordUpdateProxySettings;

    //Find Password input field by id
    @FindBy(id = "password")
    WebElement passwordProxySettings;

    //Find Confirm Password input field by id
    @FindBy(id = "confirmPassword")
    WebElement confirmPasswordProxySettings;

    //Find Cancel button by xpath
    @FindBy(xpath = "(//button[@type='button'])[9]")
    WebElement cancelPasswordProxySettings;

    //Find Submit button by xpath
    @FindBy(xpath = "(//button[@type='button'])[8]")
    WebElement submitPasswordProxySettings;

    //---------------Proxy Server Settings web elements ends--------------------


    //---------------Recaptcha image verification settings web elements starts--------------------

    //Find recaptcha image verification settings element by css
    @FindBy(css = "#sec11 > div.nlv-settings-row-title")
    WebElement reCaptchaImageVerificationSettings;

    //Find enable recaptcha no radio button by xpath
    @FindBy(xpath = "(//input[@name='enableRecaptcha'])[2]")
    WebElement enableCaptchaSettingsNoRadioButton;

    //Find enable recaptcha yes radio button by name
    @FindBy(name = "enableRecaptcha")
    WebElement enableCaptchaSettingsYesRadioButton;

    //Find recaptcha public key input field by name
    @FindBy(name = "recaptchaPublicKey")
    WebElement reCaptchaPublicKey;

    //Find recaptcha private key input field by name
    @FindBy(name = "recaptchaPrivateKey")
    WebElement reCaptchaPrivateKey;

    //---------------Recaptcha image verification settings web elements ends--------------------

//------------Declaration of web elements ends-----



    //Constructor of this class to get the webdriver and initialize webelements
    public serverConfiguration(WebDriver driver) {
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }


//----------- Declare methods for web elements start ------------

    //Method to click on update button
    public void clickUpdateButton(){updateButton.click();}
    //Method to click on cancel button
    public void clickCancelButton(){cancelButton.click();}



    //----------User interface methods for web elements starts -----//


    //Method to click on user interface tag
    public void clickUserInterface(){userInterface.click();}


    // Method to set Browser window title in the input field
    public void setBrowserWindowTitle(String strBrowserWindowTitle) {
        browserWindowTitle.sendKeys(strBrowserWindowTitle);
    }

    //Method to cleat Browser window title field
    public void clearBrowserWindowTitle(){browserWindowTitle.clear();}

    // Method to set Css style sheet location in the input field
    public void setCssStyleSheetLocation(String strCssStyleSheetLocation) {
        cssStyleSheetLocation.sendKeys(strCssStyleSheetLocation);
    }

    //Method to clear css style sheet location field
    public void clearCssStyleSheetLocation(){cssStyleSheetLocation.clear();}

    // Method to set Logo locationn the input field
    public void setLogoLocation(String strLogoLocation) {
        logoLocation.sendKeys(strLogoLocation);
    }

    //Method to clear logo location field
    public void clearLogoLocation(){logoLocation.clear();}


    // Method to set Logo link in the input field
    public void setLogoLink(String strLogoLink) {
        logoLink.sendKeys(strLogoLink);
    }

    //Method to clear logo link field
    public void clearLogoLink(){logoLink.clear();}

    // Method to set Logo width in the input field
    public void setLogoWidth(String strLogoWidth) {
        logoWidth.sendKeys(strLogoWidth);
    }

    //Method to clear logo width
    public void clearLogoWidth(){logoWidth.clear();}

    // Method to set Logo height in the input field
    public void setLogoHeight(String strLogoHeight) {
        logoHeight.sendKeys(strLogoHeight);
    }

    //Method to clear logo height
    public void clearLogoHeight(){logoHeight.clear();}

    // Method to set Sign in text top in the input field
    public void setSignInTextTop(String strSignInTextTop) {
        signInTextTop.sendKeys(strSignInTextTop);
    }

    //Method to clear sign in text top field
    public void clearSignInTextTop(){signInTextTop.clear();}

    // Method to set Sign in text right in the input field
    public void setSignInTextRight(String strSignInTextRight) {
        signInTextRight.sendKeys(strSignInTextRight);
    }

    //Method to clear sign in text right
    public void clearSignInTextRight(){signInTextRight.clear();}

    // Method to set web page footer in the input field
    public void setWebPageFooter(String strWebPageFooter) {
       webPageFooter.sendKeys(strWebPageFooter);
    }

    //Method to clear web page footer
    public void clearWebPageFooter(){webPageFooter.clear();}

    // Method to set custom URL in the input field
    public void setCustomUrl(String strCustomUrl) {
        customUrl.sendKeys(strCustomUrl);
    }

    //Method to clear custom URL
    public void clearCustomUrl(){customUrl.clear();}

    //Method to click on "Reset to original value" for "Custom sign in text (top)" tag input field
    public void clickResetToOriginalValueLinkCustomSignInTextTop(){resetToOriginalValueLinkCustomSignInTextTop.click();}

    //Method to click on "Reset to original value" for "Custom sign in text (right)" tag input field
    public void clickResetToOriginalValueLinkCustomSignInTextRight(){resetToOriginalValueLinkCustomSignInTextRight.click();}

    //Method to click on "Reset to original value" for "Custom web page footer" tag input field
    public void clickResetToOriginalValueLinkCustomWebPageFooter(){resetToOriginalValueLinkCustomWebPageFooter.click();}

    //Method to set all values for web element and update for user interface
    public void configureUserInterface(String browserWindowTitleParam, String cssStylesheetLocationParam,String logoLocationParam, String logoLinksParam, String logoWidthParam, String logoHeightParam,String customSignInTextTopParam,String customSignInTextRightParam,String customWebpageFooterParam,String customHelpUrlParam) throws InterruptedException {

        this.clickUserInterface();

        this.clearBrowserWindowTitle();
        this.setBrowserWindowTitle(browserWindowTitleParam);

        this.clearCssStyleSheetLocation();
        this.setCssStyleSheetLocation(cssStylesheetLocationParam);

        this.clearLogoLocation();
        this.setLogoLocation(logoLocationParam);

        this.clearLogoLink();
        this.setLogoLink(logoLinksParam);

        this.clearLogoWidth();
        this.setLogoWidth(logoWidthParam);

        this.clearLogoHeight();
        this.setLogoHeight(logoHeightParam);

        this.clearSignInTextTop();
        this.setSignInTextTop(customSignInTextTopParam);

        this.clearSignInTextRight();
        this.setSignInTextRight(customSignInTextRightParam);

        this.clearWebPageFooter();
        this.setWebPageFooter(customWebpageFooterParam);

        this.clearCustomUrl();
        this.setCustomUrl(customHelpUrlParam);

        this.clickUpdateButton();


    }


    // ----------User interface methods for web elements ends-----//

    //----------Microsoft outlook add-in methods for web elements starts---------------//

    //Click on outlook add in settings from server configuration
    public void clickOutlookAddinSettings(){outlookAddinSettings.click();}

    //Click on configure outlook addin policies link
    public void clickConfigureOutlookAddinPolicies(){configureOutlookAddinPolicies.click();}

    //Enable outlook add-in
    public void clickEnableOutlookRadioButtonYes(){enableOutlookRadioButtonYes.click();}

    //Disable outlook add-in
    public void clickEnableOutlookRadioButtonNo(){enableOutlookRadioButtonNo.click();}

    //Click on update button of outlook configuration page
    public void clickOutlookAddinSettingsUpdate(){outlookAddinSettingsUpdate.click();}

    //Click on cancel button of outlook configuration page
    public void clickOutlookAddinSettingsCancel(){outlookAddinSettingsCancel.click();}

    //set outlook addin server email address
    public void sendKeysOutlookAddinServerEmailAddress(String serverEmailAddressParam) {
        outlookAddinServerEmailAddress.sendKeys(serverEmailAddressParam);
    }

    //clear outlook addin server email address
    public void clearOutlookAddinServerEmailAddress(){outlookAddinServerEmailAddress.clear();}

    //Set outlook addin policy synchronization interval
    public void sendKeysOutlookPolicySyncInterval(String outlookPolicySyncIntervalParam) {
        outlookPolicySyncInterval.sendKeys(outlookPolicySyncIntervalParam);
    }

    //Clear outlook addin policy synchronization interval
    public void clearOutlookPolicySyncInterval() {outlookPolicySyncInterval.clear();}

    //Click on outlook enable secure message check box
    public void clickOutlookEnableSecureMessageCheckBox() {
        outlookEnableSecureMessageCheckBox.click();
    }

    //Set outlook addin Recipients exempt from policy
    public void setOutlookRecipientExemptFromPolicy(String outlookRecipientExemptFromPolicyParam) {
        outlookRecipientExemptFromPolicy.sendKeys(outlookRecipientExemptFromPolicyParam);
    }

    //Clear outlook addin Recipients exempt from policy
    public void clearOutlookRecipientExemptFromPolicy() {
        outlookRecipientExemptFromPolicy.clear();
    }

    //Set outlook addin keyword
    public void sendKeysOutlookSubjectKeyWord(String outlookSubjectKeyWordParam) {
        outlookSubjectKeyWord.sendKeys(outlookSubjectKeyWordParam);
    }

    //Clear outlook addin keyword asd
    public void clearOutlookSubjectKeyWord() {outlookSubjectKeyWord.clear();}

    //Set outlook addin total attachment size
    public void sendKeysOutlookTotalAttachmentSize(String outlookTotalAttachmentSizeParam) {
        outlookTotalAttachmentSize.sendKeys(outlookTotalAttachmentSizeParam);
    }

    //Clear outlook addin total attachment size
    public void clearOutlookTotalAttachmentSize() {outlookTotalAttachmentSize.clear();}

    //Set outlook addin attachment pattern
    public void setOutlookAttachmentPattern(String outlookAttachmentPatternParam) {
        outlookAttachmentPattern.sendKeys(outlookAttachmentPatternParam);
    }

    //Clear outlook addin attachment pattern
    public void clearOutlookAttachmentPattern() {outlookAttachmentPattern.clear();}

    //Click outlook addin Allow users to bypass policy radio button yes
    public void clickOutlookBypassPolicyRadioButtonYes(){outlookBypassPolicyRadioButtonYes.click();}

    //Click outlook addin Allow users to bypass policy radio button no
    public void clickOutlookBypassPolicyRadioButtonNo(){outlookBypassPolicyRadioButtonNo.click();}

    //Click  ourlook retain attachment check box
    public void clickOutlookRetainAttachmentCheckBox() {


        outlookRetainAttachmentCheckBox.click();

    }

    //Set Outlook maximum attachment size
    public void sendKeysOutlookMaximumAttachmentSize(String ParamoutlookMaximumAttachmentSize) {


        outlookMaximumAttachmentSize.sendKeys(ParamoutlookMaximumAttachmentSize);

    }

    public void clearOutlookMaximumAttachmentSize() {


        outlookMaximumAttachmentSize.clear();

    }

    //Click outlook email body as secure message radio button
    public void clickOutlookEmailBodyAsSecuremessageRadioButton() {


        outlookEmailBodyAsSecuremessageRadioButton.click();

    }

    //Click outlook email body as notification message radio button
    public void clickOutlookEmailBodyAsNotificationmessageRadioButton() {


        outlookEmailBodyAsNotificationmessageRadioButton.click();

    }

    //Set Outlook notification email address
    public void sendKeysOutlookNotificationEmailAddress(String ParamoutlookNotificationEmailAddress) {


        outlookNotificationEmailAddress.sendKeys(ParamoutlookNotificationEmailAddress);

    }

    //Click outlook include secure message in stub mail check box
    public void clickOutlookIncludeSecureMessageInStubMailCheckBox() {


        outlookIncludeSecureMessageInStubMailCheckBox.click();

    }

    //Method to handle outlook pop up window
    public void acceptAlertWindowOutlookAddin(){
        Alert alertOK = driver.switchTo().alert();
        alertOK.accept();
    }

    //Method to configure outlook addin

    public void configureOutlookAddin(String serverEmailAddress, String policySyncInterval, String subjectLineKeywords, String totalAttachmentSize, String maximumSizeforAttachment){

        this.clickOutlookAddinSettings();
        this.clickConfigureOutlookAddinPolicies();
        this.clickEnableOutlookRadioButtonYes();
        this.sendKeysOutlookAddinServerEmailAddress(serverEmailAddress);
        this.clearOutlookPolicySyncInterval();
        this.sendKeysOutlookPolicySyncInterval(policySyncInterval);
        this.clearOutlookSubjectKeyWord();
        this.sendKeysOutlookSubjectKeyWord(subjectLineKeywords);
        this.clearOutlookTotalAttachmentSize();
        this.sendKeysOutlookTotalAttachmentSize(totalAttachmentSize);
        this.clickOutlookBypassPolicyRadioButtonYes();
        this.clickOutlookRetainAttachmentCheckBox();
        this.clearOutlookMaximumAttachmentSize();
        this.sendKeysOutlookMaximumAttachmentSize(maximumSizeforAttachment);
        this.clickOutlookAddinSettingsUpdate();
        this.acceptAlertWindowOutlookAddin();

    }

    //----------Microsoft outlook add-in methods for web elements ends---------------//

    //-------Workspace Settings methods starts---------//

    public void clickWorkspace() {
        workspace.click();
    }
    public void clickEnableWorkspace() {
        enableWorkspace.click();
    }
    public void clickApplyAllWorkspace() {
        applyAllWorkspace.click();
    }
    public void clickCheckAllNotification() {
        checkAllNotification.click();
    }
    public void clearCollaboratorPerUser() {
        collaboratorPerUser.clear();
    }
    public void clearAutoDeleteDate() {
        autoDeleteDate.clear();
    }
    public void clearFirstDeletionReminder() {
        firstDeletionReminder.clear();
    }
    public void clearSecondDeletionReminder() {
        secondDeletionReminder.clear();
    }
    public void clearHideAutoDeletion() {
        hideAutoDeletion.clear();
    }
    public void sendKeysSenderLicenseCollaboration(String ParamsenderLicenseCollaboration) {
        senderLicenseCollaboration.sendKeys(ParamsenderLicenseCollaboration);
    }
    public void sendKeysCollaboratorPerUser(String ParamcollaboratorPerUser) {
        collaboratorPerUser.sendKeys(ParamcollaboratorPerUser);
    }
    public void sendKeysAutoDeleteDate(String ParamautoDeleteDate) {
        autoDeleteDate.sendKeys(ParamautoDeleteDate);
    }
    public void sendKeysFirstDeletionReminder(String ParamfirstDeletionReminder) {
        firstDeletionReminder.sendKeys(ParamfirstDeletionReminder);
    }
    public void sendKeysSecondDeletionReminder(String ParamsecondDeletionReminder) {
        secondDeletionReminder.sendKeys(ParamsecondDeletionReminder);
    }
    public void sendKeysHideAutoDeletion(String ParamhideAutoDeletion) {
        hideAutoDeletion.sendKeys(ParamhideAutoDeletion);
    }
    public void configureWorkspace(){
    }
    //-------Workspace Settings methods ends---------//

    //-----Antivirus webelemnt methods starts------//

    public void clickAntivirusEnable() {
        antivirusEnable.click();
    }
    public void clickAntivirusDisable() {
        antivirusDisable.click();
    }
    public void clickFileSizeEnable() {
        fileSizeEnable.click();
    }
    public void clickLocalServer() {
        localServer.click();
    }
    public void clickRemoteServer() {
        remoteServer.click();
    }
    public void clearFilePattern() {
        filePattern.clear();
    }
    public void clearRemoteServerAddress() {
        remoteServerAddress.clear();
    }
    public void clearMaxFilesSize() {
        maxFilesSize.clear();
    }
    public void sendKeysRemoteServer(String ParamremoteServer) {
        remoteServer.sendKeys(ParamremoteServer);
    }
    public void sendKeysMaxFilesSize(String ParammaxFilesSize) {
        maxFilesSize.sendKeys(ParammaxFilesSize);
    }
    public void sendKeysFilePattern(String ParamfilePattern) {
        filePattern.sendKeys(ParamfilePattern);
    }
    public void selectApi(String Apiversion){
        restApiSelect.findElement(By.name("metadefenderRestAPIVersion")).sendKeys(Apiversion);
    }
    //-----Antivirus webelemnt methods ends------//

    //----User settings methods start-------------//
    public void clickEnableCompliance() {
        enableCompliance.click();
    }
    public void clickDisableCompliance() {
        disableCompliance.click();
    }
    public void clickEnableQuota() {
        enableQuota.click();
    }
    public void clickDisableQuota() {
        disableQuota.click();
    }
    public void clickUserQuota() {
        userQuota.click();
    }
    public void clickMaximumUserQuota() {
        maximumUserQuota.click();
    }
    public void sendKeysUserQuota(String ParamuserQuota) {
        userQuota.sendKeys(ParamuserQuota);
    }
    public void sendKeysMaximumUserQuota(String ParammaximumUserQuota) {
        maximumUserQuota.sendKeys(ParammaximumUserQuota);

    }
    public void clearUserQuota() {
        userQuota.clear();
    }
    public void clearMaximumUserQuota() {
        maximumUserQuota.clear();
    }
    public void clickDisableExpiration() {
        disableExpiration.click();
    }
    public void clickEnableExpiration() {
        enableExpiration.click();

    }
    public void clickInactivityPeriod() {
        inactivityPeriod.click();
    }
    public void sendKeysInactivityPeriod(String ParaminactivityPeriod) {
        inactivityPeriod.sendKeys(ParaminactivityPeriod);
    }
    public void clearInactivityPeriod() {
        inactivityPeriod.clear();
    }
    public void clickExpireUser() {
        expireUser.click();
    }
    public void clickRemoveSenderLicense() {
        removeSenderLicense.click();
    }
    public void clickFristWarning() {


        fristWarning.click();

    }
    public void clickSecondWarning() {


        secondWarning.click();

    }
    public void clickExclusionList() {


        exclusionList.click();

    }
    public void clickDeleteExpireUser() {
        deleteExpireUser.click();
    }
    public void clearFristWarning() {
        fristWarning.clear();
    }
    public void clearSecondWarning() {
        secondWarning.clear();
    }
    public void clearExclusionList() {
        exclusionList.clear();
    }
    public void clearDeleteExpireUser() {
        deleteExpireUser.clear();
    }
    public void sendKeysFristWarning(String ParamfristWarning) {
        fristWarning.sendKeys(ParamfristWarning);
    }
    public void sendKeysSecondWarning(String ParamsecondWarning) {
        secondWarning.sendKeys(ParamsecondWarning);
    }
    public void sendKeysExclusionList(String ParamexclusionList) {
        exclusionList.sendKeys(ParamexclusionList);
    }
    public void sendKeysDeleteExpireUser(String ParamdeleteExpireUser) {
        deleteExpireUser.sendKeys(ParamdeleteExpireUser);
    }
    //----User settings methods end-------------//



    //----Server Configuration methods start-------------//




    public void clickServerconfigurationsidemenu() {


        serverconfigurationsidemenu.click();

    }


    public void clickAdministration() {


        administration.click();

    }

    //Method to click Server Configuration
    public void clickServerConfiguration() {


        serverConfiguration.click();

    }

    // Method to clear Company Name input field
    public void clearCompanyName() {companyName.clear();}

    // Method to clear System Name input field
    public void clearSystemName() {systemName.clear();}

    // Method to clear Administrator Email input field
    public void clearAdministratorEmail() {administratorEmail.clear();}

    // Method to clear Locale Language input field
    public void clearLocaleLanguage() {localeLanguage.clear();}

    // Method to clear Locale Country input field
    public void clearLocaleCountry() {localeCountry.clear();}


    // Method to set Company Name in the input field
    public void sendKeysCompanyName(String ParamcompanyName) {


        companyName.sendKeys(ParamcompanyName);

    }



    // Method to set System Name in the input field
    public void sendKeysSystemName(String ParamsystemName) {


        systemName.sendKeys(ParamsystemName);

    }

    // Method to set Administrator Email in the input field


    public void sendKeysAdministratorEmail(String ParamadministratorEmail) {


        administratorEmail.sendKeys(ParamadministratorEmail);

    }




    // Method to set Locale Language in the input field
    public void sendKeysLocaleLanguage(String ParamlocaleLanguage) {


        localeLanguage.sendKeys(ParamlocaleLanguage);

    }



    // Method to set Locale Country in the input field
    public void sendKeysLocaleCountry(String ParamlocaleCountry) {


        localeCountry.sendKeys(ParamlocaleCountry);

    }



    // Method to select Time Zone  in the drop down field
    public void selectTimeZoneDropdown(String ParamtimeZoneDropdownSelect) {


        Select drpTimeZone = new Select(timeZoneDropdownSelect);
        drpTimeZone.selectByVisibleText(ParamtimeZoneDropdownSelect);

    }

    //Method to configure Server Configuration

    public void configureServerConfiguration(String companyname, String systemname, String administratoremail, String timezone, String localelanguage, String localecountry){

        this.clickAdministration();
        this.clickServerconfigurationsidemenu();
        this.clickServerConfiguration();
        this.clearCompanyName();
        this.sendKeysCompanyName(companyname);
        this.clearSystemName();
        this.sendKeysSystemName(systemname);
        this.clearAdministratorEmail();
        this.sendKeysAdministratorEmail(administratoremail);
        this.selectTimeZoneDropdown(timezone);
        this.clearLocaleLanguage();
        this.sendKeysLocaleLanguage(localelanguage);
        this.clearLocaleCountry();
        this.sendKeysLocaleCountry(localecountry);
        this.clickUpdateButton();

    }


    //----Server Configuration methods end-------------//


    //----Email and Notification Settings methods start-------------//




    // Method to clear Notification Mail Server input field
    public void clearNotificationMailServer() {


        notificationMailServer.clear();

    }


    // Method to clear Notification Mail Server Username input field
    public void clearNotificationMailServerUsername() {


        notificationMailServerUsername.clear();

    }


    // Method to clear Notification Mail Server Password input field
    public void clearNotificationMailServerPassword() {


        notificationMailServerPassword.clear();

    }


    // Method to clear Notification Mail Server password confirm input field
    public void clearNotificationMailServerPasswordConfirm() {


        notificationMailServerPasswordConfirm.clear();

    }

    // Method to clear Notification Mail Server port no input field
    public void clearNotificationMailServerPortNo() {


        notificationMailServerPortNo.clear();

    }


    // Method to clear Notification Sender input field
    public void clearNotificationSender() {


        notificationSender.clear();

    }


    // Method to clear System Notification Mail Sender input field
    public void clearSystemNotificationSender() {


        systemNotificationSender.clear();

    }




    // Method to set Notification Mail Server in the input field
    public void sendKeysNotificationMailServer(String ParamnotificationMailServer) {


        notificationMailServer.sendKeys(ParamnotificationMailServer);

    }


    // Method to set Notification Mail Server username in the input field
    public void sendKeysNotificationMailServerUsername(String ParamnotificationMailServerUsername) {


        notificationMailServerUsername.sendKeys(ParamnotificationMailServerUsername);

    }


    // Method to set Notification Mail Server password in the input field
    public void sendKeysNotificationMailServerPassword(String ParamnotificationMailServerPassword) {


        notificationMailServerPassword.sendKeys(ParamnotificationMailServerPassword);

    }


    // Method to set Notification Mail Server passwprd confirm in the input field
    public void sendKeysNotificationMailServerPasswordConfirm(String ParamnotificationMailServerPasswordConfirm) {


        notificationMailServerPasswordConfirm.sendKeys(ParamnotificationMailServerPasswordConfirm);

    }


    // Method to set Notification Mail Server port no in the input field
    public void sendKeysNotificationMailServerPortNo(String ParamnotificationMailServerPortNo) {


        notificationMailServerPortNo.sendKeys(ParamnotificationMailServerPortNo);

    }


    // Method to set Notification Sender in the input field
    public void sendKeysNotificationSender(String ParamnotificationSender) {


        notificationSender.sendKeys(ParamnotificationSender);

    }


    // Method to set System Notification Sender in the input field
    public void sendKeysSystemNotificationSender(String ParamsystemNotificationSender) {


        systemNotificationSender.sendKeys(ParamsystemNotificationSender);

    }


    // Method to click Email and Notification Settings
    public void clickEmailandNotificationSettings() {


        emailandNotificationSettings.click();

    }


    // Method to click notification mail server password set button
    public void clickNotificationMailServerPasswordSet() {


        notificationMailServerPasswordSet.click();

    }


    // Method to click notification mail server password clear button
    public void clickNotificationMailServerPasswordClear() {


        notificationMailServerPasswordClear.click();

    }


    // Method to click notification mail server password submit button
    public void clickNotificationMailServerPasswordSubmit() {


        notificationMailServerPasswordSubmit.click();

    }


    // Method to click notification mail server password cancel button
    public void clickNotificationMailServerPasswordCancel() {


        notificationMailServerPasswordCancel.click();

    }


    // Method to click notification mail server password close button
    public void clickNotificationMailServerPasswordClose() {


        notificationMailServerPasswordClose.click();

    }


    // Method to click notification link protocol HTTP button
    public void clickNotificationLinkProtocolHTTP() {


        notificationLinkProtocolHTTP.click();

    }

    // Method to click notification link protocol HTTPS button
    public void clickNotificationLinkProtocolHTTPS() {


        notificationLinkProtocolHTTPS.click();

    }

    // Method to click notification link protocol HTTPS button
    public void clickOnlyAllowHTTPS() {


        onlyAllowHTTPS.click();

    }


    // Method to click Notify user when password reset by an administrator yes button
    public void clickNotifyUserOnAdminPasswordResetYes() {


        notifyUserOnAdminPasswordResetYes.click();

    }

    // Method to click Notify user when password reset by an administrator no button
    public void clickNotifyUserOnAdminPasswordResetNo() {


        notifyUserOnAdminPasswordResetNo.click();

    }


    // Method to click Notify user when password reset by user yes button
    public void clickNotifyUserOnUserPasswordResetYes() {


        notifyUserOnUserPasswordResetYes.click();

    }

    // Method to click Notify user when password reset by user no button
    public void clickNotifyUserOnUserPasswordResetNo() {


        notifyUserOnUserPasswordResetNo.click();

    }


   // Method to click  Populate username for delivery notification links yes button
    public void clickApDeliveryLinkYes() {


        apDeliveryLinkYes.click();

    }

    // Method to click  Populate username for delivery notification links no button
    public void clickApDeliveryLinkNo() {


        apDeliveryLinkNo.click();

    }

    // Method to click Enable email HTML mode yes button
    public void clickEmailEnableHtmlModeYes() {


        emailEnableHtmlModeYes.click();

    }

    // Method to click Enable email HTML mode no button
    public void clickEmailEnableHtmlModeNo() {


        emailEnableHtmlModeNo.click();

    }

    public void selectEncryptedconnectionDropdown(String ParamEncryptedconnection) {


        Select drpEncryptedconnection = new Select(encryptedConnection);
        drpEncryptedconnection.selectByVisibleText(ParamEncryptedconnection);

    }


    //Method to handle edit password empty  pop up window
    public void acceptAlertWindowEditPassword(){
        Alert alertOK = driver.switchTo().alert();
        alertOK.accept();
    }

    //Method to handle Only allow HTTPS  pop up window
    public void acceptAlertWindowOnlyAllowHTTPS(){
        Alert alertOK = driver.switchTo().alert();
        alertOK.accept();
    }


    //Method to handle Enable email HTML mode no button  pop up window
    public void acceptAlertWindowEnableEmailHtmlMode(){
        Alert alertOK = driver.switchTo().alert();
        alertOK.accept();
    }

    //Method to Configure Email and Notification Settings
    public void configureEmailAndNotificationSettings(String ParamNotificationMail, String ParamNotificationMailUsername, String ParamNotificationMailPassword, String ParamNotificationPort, String ParamEncrypted, String ParamNotificationSender){

        this.clickAdministration();
        this.clickServerconfigurationsidemenu();
        this.clickEmailandNotificationSettings();
        this.clearNotificationMailServer();
        this.sendKeysNotificationMailServer(ParamNotificationMail);
        this.clearNotificationMailServerUsername();
        this.sendKeysNotificationMailServerUsername(ParamNotificationMailUsername);
        this.clickNotificationMailServerPasswordSet();
        this.clearNotificationMailServerPassword();
        this.sendKeysNotificationMailServerPassword(ParamNotificationMailPassword);
        this.clearNotificationMailServerPasswordConfirm();
        this.sendKeysNotificationMailServerPasswordConfirm(ParamNotificationMailPassword);
        this.clickNotificationMailServerPasswordSubmit();
        this.clearNotificationMailServerPortNo();
        this.sendKeysNotificationMailServerPortNo(ParamNotificationPort);
        this.selectEncryptedconnectionDropdown(ParamEncrypted);
        this.clearNotificationSender();
        this.sendKeysSystemNotificationSender(ParamNotificationSender);
        this.clickNotificationLinkProtocolHTTP();
        this.clickNotifyUserOnAdminPasswordResetNo();
        this.clickNotifyUserOnUserPasswordResetNo();
        this.clickApDeliveryLinkYes();
        this.clickEmailEnableHtmlModeYes();
        this.clickUpdateButton();



    }


    //----Email and Notification Settings methods end-------------//

    //----Delivery Settings methods starts-------------//



    //Method to click Delivery Settings
    public void clickDeliverySettings() {


        deliverySettings.click();

    }

    //Method to handle Default Secure Message frame
    public void acceptDefaultSecureMessage() {
        driver.switchTo().frame(defaultSecureMessage);
    }


    //Method to handle Default delivery notification message frame by index number 0
    public void acceptDefaultDeliveryNotificationMessage() {
        driver.switchTo().frame(0);
    }

    //Method to handle Delivery notification footer (uneditable by sender) frame by index number 1
    public void acceptDeliveryNotificationFooter() {
        driver.switchTo().frame(1);
    }

    //Method to set default secure message
    public void sendKeysDefaultSecureMessageBody(String ParamdefaultSecureMessageBody) {


        defaultSecureMessageBody.sendKeys(ParamdefaultSecureMessageBody);
        driver.switchTo().defaultContent();

    }

    //Method to clear default secure message
    public void clearDefaultSecureMessageBody() {


        defaultSecureMessageBody.clear();

    }



    //Method to click "List files in delivery notification message " check box
    public void clickListDeliveredFilesOnDeliveryNotification() {


        listDeliveredFilesOnDeliveryNotification.click();

    }



    //Method to clear "Delivery expires after (in days)" input field
    public void clearDeliveryExpirationDays() {


        deliveryExpirationDays.clear();

    }



    //Method to set "Delivery expires after (in days)" input field
    public void sendKeysDeliveryExpirationDays(String ParamdeliveryExpirationDays) {


        deliveryExpirationDays.sendKeys(ParamdeliveryExpirationDays);

    }


    //Method to click on "Apply to all users " check box
    public void clickApplyDeliveryExpirationDaysToAllUsers() {


        applyDeliveryExpirationDaysToAllUsers.click();

    }

    //Method to click on "Delivery Options : Show date available by default " check box
    public void clickShowDateAvailable() {


        showDateAvailable.click();

    }


    //Method to click "Delivery Options : Show password by default" check box
    public void clickShowPasswordDefault() {


        showPasswordDefault.click();

    }

    //Method to click "Express Delivery Options: Show secure message by default" check box
    public void clickExpDeliverySimpleModeShowSecureMsg() {


        expDeliverySimpleModeShowSecureMsg.click();

    }


    //Method to click "Express Delivery Options: Show notification message by default" check box
    public void clickExpDeliverySimpleModeShowNotificationMsg() {


        expDeliverySimpleModeShowNotificationMsg.click();

    }

    //Method to click "Always require recipients to sign in" tag  yes radio button
    public void clickDeliveryAlwaysRequireSignInYes() {


        deliveryAlwaysRequireSignInYes.click();

    }


    //Method to click "Always require recipients to sign in" tag  no radio button
    public void clickDeliveryAlwaysRequireSignInNo() {


        deliveryAlwaysRequireSignInNo.click();

    }


    //Method to click "Require recipients to sign in by default" tag  yes radio button
    public void clickRecipientsSignInDefaultYes() {


        recipientsSignInDefaultYes.click();

    }

    //Method to click "Require recipients to sign in by default" tag  no radio button
    public void clickRecipientsSignInDefaultNo() {


        recipientsSignInDefaultNo.click();

    }

    //Method to click "Enable reply" tag  yes radio button
    public void clickEnableSecureReplyYes() {


        enableSecureReplyYes.click();

    }

    //Method to click "Enable reply" tag  no radio button
    public void clickEnableSecureReplyNo() {


        enableSecureReplyNo.click();

    }

    //Method to click "Enable reply to all" tag  yes radio button
    public void clickEnableReplyAllYes() {


        enableReplyAllYes.click();

    }

    //Method to click "Enable reply to all" tag  no radio button
    public void clickEnableReplyAllNo() {


        enableReplyAllNo.click();

    }

    //Method to click "Show reply section by default "  check box by name
    public void clickShowSecureReplySectionByDefault() {


        showSecureReplySectionByDefault.click();

    }

    //Method to select "Delimiter character for auto-complete"   by Visible Text
    public void selectDelimiterCharacter(String ParamdelimiterCharacter) {

        Select dlmCharacter = new Select(delimiterCharacter);
        dlmCharacter.selectByVisibleText(ParamdelimiterCharacter);


    }


    //Method to click "Configure paypal settings "  link
    public void clickAdminPaypalConfig() {


        adminPaypalConfig.click();

    }

    //Method to click "Configure limited sender settings "  link
    public void clickAdminLimitedSenderConfig() {


        adminLimitedSenderConfig.click();

    }


    //----Configure paypal settings  methods starts-------------//


    //Method to click "Enable PayPal" tag  yes radio button
    public void clickEnablePaypalYes() {


        enablePaypalYes.click();

    }

    //Method to click "Enable PayPal" tag  no radio button
    public void clickEnablePaypalNo() {


        enablePaypalNo.click();

    }


    //Method to clear "PayPal payment account" tag input field
    public void clearPaypalPaymentAccount() {


        paypalPaymentAccount.clear();

    }

    //Method to Set "PayPal payment account" tag input field
    public void sendKeysPaypalPaymentAccount(String ParampaypalPaymentAccount) {


        paypalPaymentAccount.sendKeys(ParampaypalPaymentAccount);

    }


    //Method to clear "PayPal API username" tag input field
    public void clearPaypalApiUsername() {


        paypalApiUsername.clear();

    }

    //Method to set "PayPal API username" tag input field
    public void sendKeysPaypalApiUsername(String ParampaypalApiUsername) {


        paypalApiUsername.sendKeys(ParampaypalApiUsername);

    }


    //Method to click " set" tag button
    public void clickPaypalApiPasswordSet() {


        paypalApiPasswordSet.click();

    }

    //Method to click " Clear" tag button
    public void clickPaypalApiPasswordClear() {


        paypalApiPasswordClear.click();

    }


    // Method to clear "Paypal API password " tag input field
    public void clearPaypalAPIPassword() {


        paypalAPIPassword.clear();

    }

    // Method to set "Paypal API password " tag input field
    public void sendKeysPaypalAPIPassword(String ParampaypalAPIPassword) {


        paypalAPIPassword.sendKeys(ParampaypalAPIPassword);

    }


    // Method to set "Paypal API password confirm" tag input field
    public void sendKeysPaypalAPIPasswordConfirm(String ParampaypalAPIPasswordConfirm) {


        paypalAPIPasswordConfirm.sendKeys(ParampaypalAPIPasswordConfirm);

    }

    // Method to clear "Paypal API password confirm" tag input field
    public void clearPaypalAPIPasswordConfirm() {


        paypalAPIPasswordConfirm.clear();

    }

    //Method to click "Paypal API password submit" button
    public void clickPaypalAPIPasswordSubmit() {


        paypalAPIPasswordSubmit.click();

    }


    //Method to click "Paypal API password cancel" button
    public void clickPaypalAPIPasswordCancel() {


        paypalAPIPasswordCancel.click();

    }

    //Method to click "Paypal API password close" button
    public void clickPaypalAPIPasswordClose() {


        paypalAPIPasswordClose.click();

    }


    //Method to clear "PayPal signature" tag input field
    public void clearPaypalApiSignature() {


        paypalApiSignature.clear();

    }


    //Method to set "PayPal signature" tag input field
    public void sendKeysPaypalApiSignature(String ParampaypalApiSignature) {


        paypalApiSignature.sendKeys(ParampaypalApiSignature);

    }


    // Method to set "List of users who can charge for delivery" tag input field
    public void sendKeysPaypalUsersList(String ParampaypalUsersList) {


        paypalUsersList.sendKeys(ParampaypalUsersList);

    }

    // Method to clear "List of users who can charge for delivery" tag input field
    public void clearPaypalUsersList() {


        paypalUsersList.clear();

    }


    //Method to clear "Payment privacy policy URL" tag input field
    public void clearPaymentPrivacyPolicyUrl() {


        paymentPrivacyPolicyUrl.clear();

    }


    //Method to set "Payment privacy policy URL" tag input field
    public void sendKeysPaymentPrivacyPolicyUrl(String ParampaymentPrivacyPolicyUrl) {


        paymentPrivacyPolicyUrl.sendKeys(ParampaymentPrivacyPolicyUrl);

    }


    // Method clear "Payment refund policy URL" tag input field
    public void clearPaymentRefundPolicyUrl() {


        paymentRefundPolicyUrl.clear();

    }

    // Method set "Payment refund policy URL" tag input field
    public void sendKeysPaymentRefundPolicyUrl(String ParampaymentRefundPolicyUrl) {


        paymentRefundPolicyUrl.sendKeys(ParampaymentRefundPolicyUrl);

    }

    // Method to click " Verify Paypal configuration Settings" link
    public void clickVerifyPaypalConfigurationSettings() {


        verifyPaypalConfigurationSettings.click();

    }


    // method to clear "Verify PayPal account settings First name" tag input field
    public void clearPaypalAccountFirstName() {


        paypalAccountFirstName.clear();

    }

    // method to set "Verify PayPal account settings First name" tag input field
    public void sendKeysPaypalAccountFirstName(String ParampaypalAccountFirstName) {


        paypalAccountFirstName.sendKeys(ParampaypalAccountFirstName);

    }

    //Method to clear "Verify PayPal account settings Last name" tag input field
    public void clearPaypalAccountLastName() {


        paypalAccountLastName.clear();

    }

    //Method to set "Verify PayPal account settings Last name" tag input field
    public void sendKeysPaypalAccountLastName(String ParampaypalAccountLastName) {


        paypalAccountLastName.sendKeys(ParampaypalAccountLastName);

    }

    // Method to click "Verify paypal" button
    public void clickPaypalAccountVerify() {


        paypalAccountVerify.click();

    }


    //Method to click "Verify PayPal account settings close" button
    public void clickPaypalAccountClose() {


        paypalAccountClose.click();

    }

    //Method to click " Update " tag button
    public void clickPaypalAccountUpdate() {


        paypalAccountUpdate.click();

    }

    //Method to click "Cancel" button
    public void clickPaypalAccountCancel() {


        paypalAccountCancel.click();

    }





    //----Configure paypal settings  methods ends-------------//


    // -------Configure limited sender settings methods starts-------//



    // Method to click " Enable limited senders" tag  yes radio button
    public void clickEnableLimitedSenderYes() {


        enableLimitedSenderYes.click();

    }


    // Method to click " Enable limited senders" tag  no radio button
    public void clickEnableLimitedSenderNo() {


        enableLimitedSenderNo.click();

    }

    //Method to click "Require Sender to sign in" tag check box
    public void clickRequireSenderSignIn() {


        requireSenderSignIn.click();

    }

    //Method to click "Allow user to type in" tag radio button
    public void clickAllowInputRecipientAddress() {


        allowInputRecipientAddress.click();

    }

    //Method to clear "Restrict recipients to" tag input field
    public void clearRecipientRestrictionList() {


        recipientRestrictionList.clear();

    }

    //Method to set "Restrict recipients to" tag input field
    public void sendKeysRecipientRestrictionList(String ParamrecipientRestrictionList) {


        recipientRestrictionList.sendKeys(ParamrecipientRestrictionList);

    }


    //Method to click "Use default value" tag radio button
    public void clickAllowDefaultRecipient() {


        allowDefaultRecipient.click();

    }

    //Method to clear " Use default value" tag input field
    public void clearDefaultRecipient() {


        defaultRecipient.clear();

    }


    //Method to set " Use default value" tag input field
    public void sendKeysDefaultRecipient(String ParamdefaultRecipient) {


        defaultRecipient.sendKeys(ParamdefaultRecipient);

    }

    // Method to click "Use default value visible" tag check box
    public void clickDefaultRecipientVisible() {


        defaultRecipientVisible.click();

    }

    //Method to click "List user with Email: *@ " tag radio button
    public void clickAllowListUsersWithEmail() {


        allowListUsersWithEmail.click();

    }

    //Method to clear " List user with Email: *@" tag input field
    public void clearUsersWithEmail() {


        usersWithEmail.clear();

    }

    //Method to set " List user with Email: *@" tag input field
    public void sendKeysUsersWithEmail(String ParamusersWithEmail) {


        usersWithEmail.sendKeys(ParamusersWithEmail);

    }


    // Method to click "  Show subject field" tag  check box
    public void clickShowSubjectField() {


        showSubjectField.click();

    }

    //Method to click "  Show message field " tag  check
    public void clickShowMessageField() {


        showMessageField.click();

    }

    //Method to select "Maximum number of file uploads" drop down box
    public void selectMaxFileUploads(String ParammaxFileUploads) {

        Select maxFile = new Select(maxFileUploads);
        maxFile.selectByVisibleText(ParammaxFileUploads);


    }

    // Method to clear "Maximum size per file (KB)" tag input field
    public void clearMaxSizePerFile() {


        maxSizePerFile.clear();

    }

    // Method to set "Maximum size per file (KB)" tag input field
    public void sendKeysMaxSizePerFile(String ParammaxSizePerFile) {


        maxSizePerFile.sendKeys(ParammaxSizePerFile);

    }



    // Method to click "  Send email notification to recipients " tag  check box
    public void clickSendNotificationRecipients() {


        sendNotificationRecipients.click();

    }


    // Method to click "  Require recipients to sign in  " tag  check box
    public void clickRequireRecipientSignIn() {


        requireRecipientSignIn.click();

    }


    //Method to clear "Automatically delete after (in days) " tag input field
    public void clearAutoDeletionDays() {


        autoDeletionDays.clear();

    }

    //Method to set "Automatically delete after (in days) " tag input field
    public void sendKeysAutoDeletionDays(String ParamautoDeletionDays) {


        autoDeletionDays.sendKeys(ParamautoDeletionDays);

    }

    // Method to click "  Limited Sender Settings Update " tag  button
    public void clickLimitedSenderUpdate() {


        limitedSenderUpdate.click();

    }


    //Method to click "  Limited Sender Settings Cancel " tag  button
    public void clickLimitedSenderCancel() {


        limitedSenderCancel.click();

    }


    //Method to configure Delivery Settings

    public void configureDeliverySettings(){

    }








    // -------Configure limited sender settings methods ends-------//





    //----Delivery Settings methods ends-------------//


//------------Declare methods for web elements end ------

}