<pre><?php
function openDatabaseConnection() {
    // Simulate opening a database connection
    echo "Database connected!\n<br/>";
    return true;  // Simulate the connection object
}

function closeDatabaseConnection($conn) {
    // Simulate closing a database connection
    echo "Connection closed!\n<br/>";
}

$conn = null;

try {
    // Simulate opening a connection
    $conn = openDatabaseConnection();

    // Simulate an exception
    throw new Exception("Something went wrong with the query!");

    // Return or exit to prevent further execution
    return;  // This will stop the script before closing the connection

} catch (Exception $e) {
    // Handle the exception
    echo "Caught exception: " . $e->getMessage() . "\n";
    
    // Exit to prevent further execution
    exit;  // This will stop the script before closing the connection
} finally {

        closeDatabaseConnection($conn);
    
}

// This line will not be executed
if ($conn) {
    closeDatabaseConnection($conn);
}

?>
