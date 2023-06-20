# NeedCabASAP

Welcome to NeedCabASAP, an intuitive and efficient Uber-like app that seamlessly connects users with nearby vehicles, allowing them to book rides, calculate costs, and enjoy convenient transportation services.

## Table of Contents
1. [Requirements](#requirements)
2. [User Happy Path](#user-happy-path)
3. [Installation](#installation)
4. [Usage](#usage)
5. [Contributing](#contributing)
6. [License](#license)

## Requirements
The NeedCabASAP app fulfills the following requirements:
1. Booking of ride time: Users can provide the desired date and book a ride from point A to point B, while selecting the city.
2. Finding the nearest vehicle: The app locates the nearest available vehicle based on the user's location.
3. Calculating the cost: The system calculates the cost of the ride based on various factors such as distance, time, and any additional charges.

## User Happy Path
The user happy path describes the ideal sequence of steps a user would take to successfully utilize the NeedCabASAP app:
1. The client provides the date and wants to book a ride from point A to point B, selecting the city.
2. The system verifies the validity of the provided date, ensuring it does not conflict with any specific rules (e.g., Sunday vs Saturday).
3. The system checks if both point A and point B fall within the designated city boundaries.
4. Based on the distance and other relevant factors, the system calculates the cost of the ride.
5. The day of the ride arrives, and the user is ready to embark on their journey.
6. The app locates the nearest available vehicle, ensuring a prompt and efficient pickup experience.

## Installation
To install the NeedCabASAP app, follow these steps:
1. Clone the repository from GitHub: `git clone https://github.com/yourusername/NeedCabASAP.git`
2. Navigate to the project directory: `cd NeedCabASAP`
3. Install the required dependencies: `npm install`
4. Configure the app by providing necessary environment variables.
5. Start the application: `npm start`

## Usage
To use the NeedCabASAP app, follow these guidelines:
1. Launch the app on your device.
2. Register or log in using your credentials.
3. Provide the desired ride date, starting point (point A), destination (point B), and select the city.
4. Confirm the ride details and proceed to book.
5. The app will verify the date, check the location validity, calculate the cost, and notify you of the confirmed booking.
6. On the day of the ride, ensure you are ready at the specified location.
7. The app will automatically find the nearest available vehicle for pickup, providing you with a seamless experience.

## Contributing
We welcome contributions from the community to enhance the NeedCabASAP app. To contribute, please follow these steps:
1. Fork the NeedCabASAP repository.
2. Create a new branch for your feature: `git checkout -b feature/my-feature`
3. Commit your changes: `git commit -m 'Add my feature'`
4. Push to the branch: `git push origin feature/my-feature`
5. Submit a pull request.

## License
The NeedCabASAP app is licensed under the [MIT License](https://opensource.org/licenses/MIT). You are free to modify and distribute the app as per the terms of this license.
