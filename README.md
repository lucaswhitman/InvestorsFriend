# InvestorsFriend
Android application for company valuation via standard value investing techniques. The primary formula used at this point is the Graham Formula:

![Graham Formula](https://cdn7.oldschoolvalue.com/blog/wp-content/uploads/graham-formula-update.png)

# Notes
This application is a POC for a larger app while I learn Android development. Future design considerations:
* There are several different formulas for company valuation including the General DCF Formula, the Zero Growth Formula, and the Constant growth formula. These should be added to the application to allow for multiple methods to assess the company's value.
* Currently the application requires the user to look up and enter data which is available via public APIs. The application should be refactored to pull this data down where possible.
* UI would likely be best with a search prompt for a ticker that then displays the different valuations based on API data.

