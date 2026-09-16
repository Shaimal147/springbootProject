async function getExpenses() {
    const url = 'http://localhost:8080/home/expenses';

    try {
        const response = await fetch(url);

        if (!response.ok) {
            throw new Error(`HTTP error! status: ${response.status}`)
        }

        const data = await response.json();
        console.log(data);
        const entriesEl = document.getElementById("entriesEl");
        entriesEl.textContent = JSON.stringify(data, null, 2);


        return data;
    } catch (error) {
        console.error(`Fetch failed: ${error.message}`);
    }
}