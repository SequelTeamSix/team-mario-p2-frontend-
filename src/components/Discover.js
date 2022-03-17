//Discover page - it will lead to create and update. Main source of web API functionality
//buttons for create/update
//lists events
//search bar for events
//search by each variable?
export default function Discover() {
    return (
        <section class="home" id="home">
        <div class="max-width">
            <div class="home-content">
                <div class="text-1">Welcome to</div>
                <div class="text-2">The<span> Discover Page</span></div>
                <div class="text-3">To do:
                <ol>
                    <li>buttons to create your own event and update it</li>
                    <li>List all events</li>
                    <li>Get mapping functionality, dynamic search bar</li>
                    <li>Get mapping for each type (skill/sport/etc). Try making it with 1 search bar? Maybe have different buttons to swap what we're searching by?</li>
                    <li>Attend buttons on each posting, post mappings to make each user attend each event they want to</li>
                </ol>
                </div>
                </div>
        </div>
    </section> 
    );
  }